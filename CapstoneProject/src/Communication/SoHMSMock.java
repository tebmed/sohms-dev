package Communication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SoHMSMock {

	public void InterfaceMock() throws FileNotFoundException{		
		int choice;
		String instruction;
		boolean validChoice;
		boolean quit = false;
		
		Scanner reader = new Scanner(System.in);
		PrintWriter writter = new PrintWriter("instructions.txt");
		
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
				if(choice == 1)
				{
					//TODO Implémentation lors du choix 1
					System.out.println("Choix 1 effectué");
					
				}else if(choice == 2){
					//TODO Implémentation lors du choix 1
					System.out.println("Choix 2 effectué");
				}
				do{
					System.out.println("Instruction(\"quit\" to leave) : ");
					instruction = reader.next();
					writter.write(instruction + '\n');
				}while(!instruction.equals("quit"));			
			}else
				quit = true;
				
		}while(!quit);
		
		writter.close();
		reader.close();
	}
}
