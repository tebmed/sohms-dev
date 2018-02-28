package Mock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MocArena {

	public static void main(String[] args) throws InterruptedException {
		ServerSocket serv;
		Socket client;
		
		BufferedReader reader;
		PrintStream writer;

		try {
			serv = new ServerSocket(5004);
			System.out.println("Arena Simulation : running done");
			client = serv.accept();
			reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			writer = new PrintStream(client.getOutputStream());
			
			String message;
			while(true) {
				message = reader.readLine();
				writer.println("OK:" + message);
				writer.println("START:" + message);
				Thread.sleep(5000);
				writer.println("END:" + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}