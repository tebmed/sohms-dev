package Communication;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurSocket {

	Socket socketArena;
	Socket socketIHM;
	ServerSocket socketserver;
	
	public ServeurSocket() throws IOException
	{
		socketArena = null;
		socketIHM = null;
		socketserver = new ServerSocket(2009);
	}
	
	public Socket getSocketArena()
	{
		return socketArena;
	}
	
	public Socket getSocketIHM()
	{
		return socketIHM;
	}
	
	
	public static void main(String[] zero) 
	{
		
		
		

		try {
		System.out.println("");
		
//			socketduserveur = socketserver.accept(); 
//			OutputStream out = socketduserveur.getOutputStream();
//			String s = "testStringServerSocket";
//			
//			for(int i = 0 ; i< s.length() ; ++i)
//			{
//				out.write(s.charAt(i));
//			}
//			System.out.println("Un zéro s'est connecté !");
//		        socketserver.close();
//		        socketduserveur.close();
//
//		}catch (IOException e) {
//			e.printStackTrace();
		}
		finally {
			
		}
	}

}
