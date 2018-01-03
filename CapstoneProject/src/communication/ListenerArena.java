package communication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ListenerArena implements Runnable{

	Socket socketArena;
	
	public ListenerArena(Socket s) {
		this.socketArena = s;
	}
	
	@Override
	public void run() {
		String message = "";
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socketArena.getInputStream()));

			while(true) {
				message = reader.readLine();

				
				
				File log = new File("logsArena.txt");
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				
				out.write(message + '\n');
				out.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
