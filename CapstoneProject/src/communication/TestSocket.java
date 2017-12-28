package communication;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocket {

	public static void main(String[] zero) {
		
		Socket socket;

		try {
		
		     socket = new Socket(InetAddress.getLocalHost(),2009);	
	         
		     InputStream in = socket.getInputStream();
		     String s ="";
		     int c;
		     while((c = in.read())!=-1)
		     {
		    	 System.out.println();
		    	 s+= (char)c;
		     }
		     System.out.println(s);
		     socket.close();

		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
