package communication;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import application.InitialisationSysteme;

public class ComGUI extends WebSocketServer{

    private static int TCP_PORT = 8003;
    private List<WebSocket> socketsIHM;
    private List<String> messages;

	public ComGUI() throws IOException
	{
        super(new InetSocketAddress(TCP_PORT));
        socketsIHM = new ArrayList<WebSocket>();
        messages = new ArrayList<String>();
	}
	
	@Deprecated
	public WebSocket getSocketIHM()
	{
		if(socketsIHM.isEmpty())
			return null;
		else	
			return socketsIHM.get(0);
	}
	
	public void send(String data) {
		this.send(data, 0);
	}
	
	public void send(String data, int socketIndex) {
		this.socketsIHM.get(0).send(data);
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
        int index = this.socketsIHM.indexOf(conn);
        this.messages.add(index, message);
        
        if(message.startsWith("init")) {
        	// Enlève le surplus pour un parsing correct
        	String subMessage = message.substring(6, message.length()-1);
        	
        	InitialisationSysteme.initialiserSysteme(subMessage);
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
