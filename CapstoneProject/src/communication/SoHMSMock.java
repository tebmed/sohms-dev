package communication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SoHMSMock extends Thread {

	// Informations de connexion pour le socket Arena
	private final static int port = 1202;
	private final static String arenaAddresse = "127.0.0.1";
	
	Socket socketArena;
	
	public SoHMSMock() {
		InetAddress arenaAddr;
		try {
			arenaAddr = InetAddress.getByName(arenaAddresse);
			this.socketArena = new Socket(arenaAddr, port);
			new Thread(new ListenerArena(socketArena)).start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void InterfaceMock() throws FileNotFoundException{		
		int choice;
		String instruction;
		boolean validChoice;
		boolean quit = false;
		ServeurSocket serv = null;
		
		try {
			 serv = new ServeurSocket();
			 serv.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner reader = new Scanner(System.in);
		PrintWriter writter = new PrintWriter("instructions.txt");
		
		System.out.println("En attente de la connexion des clients sur les serveurs");
		
		while(socketArena == null)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Connexion établie avec Arena et l'IHM");

		
		// Tant que l'utilisateur ne quitte pas l'interface (choix 3)
		do{
			
			// Demande à l'utilisateur de faire le choix 1 ou 2
			do{
				System.out.println(" 1) Arena");
				System.out.println(" 2) IHM");
				System.out.println(" 3) Quitter");
				System.out.println("Choix ?");
				
				choice = reader.nextInt();
				validChoice = (choice >= 1 && choice <= 3);
				
				if(!validChoice)
					System.out.println("Choix invalide!");
				
			}while(!validChoice);
						
			if(choice != 3)
			{
				System.out.println("Instruction : ");
				instruction = reader.next();
				writter.write(instruction + '\n');
				
				if(choice == 1)
				{
					try {
						OutputStream out = socketArena.getOutputStream();
						for(char c : instruction.toCharArray()) {
							out.write(c);
						}
						out.write('\n');
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}else if(choice == 2){
					serv.getSocketIHM().send(instruction);
				}
						
			}else
				quit = true;
				
		}while(!quit);
		
		writter.close();
		reader.close();
	}
}
