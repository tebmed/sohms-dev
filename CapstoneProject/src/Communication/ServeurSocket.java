package Communication;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class ServeurSocket extends WebSocketServer{

	
    private static int TCP_PORT = 8003;
    private List<WebSocket> socketsIHM;
    

	public ServeurSocket() throws IOException
	{
        super(new InetSocketAddress(TCP_PORT));
        socketsIHM = new ArrayList<WebSocket>();		
	}
	
	public WebSocket getSocketIHM()
	{
		if(socketsIHM.isEmpty())
			return null;
		else	
			return socketsIHM.get(0);
	}
	
	
	@Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        socketsIHM.add(conn);
        System.out.println("New connection from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        socketsIHM.remove(conn);
        System.out.println("Closed connection to " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("Message from client: " + message);
		try {
			File log = new File("logsIHM.txt");
			PrintWriter out = new PrintWriter(new FileWriter(log, true));
			
			out.write(message + '\n');
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
        if (conn != null) {
        	socketsIHM.remove(conn);
            // do some thing if required
        }
        System.out.println("ERROR from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
    }

}
