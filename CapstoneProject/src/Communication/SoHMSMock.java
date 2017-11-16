package Communication;

import java.util.Scanner;

public class SoHMSMock {

	public void InterfaceMock(){
		Scanner reader = new Scanner(System.in);
		int choice;
		boolean validChoice;
		
		// Demande à l'utilisateur de faire le choix 1 ou 2
		do{
			System.out.println(" 1) Choix 1");
			System.out.println(" 2) Choix 2");
			System.out.println("Choix ?");
			
			choice = reader.nextInt();
			validChoice = (choice >= 1 && choice <= 2);
			
			if(!validChoice)
				System.out.println("Choix invalide!");
			
		}while(!validChoice);
				
		if(choice == 1)
		{
			//TODO Implémentation lors du choix 1
			System.out.println("Choix 1 effectué");
		}else{
			//TODO Implémentation lors du choix 1

			System.out.println("Choix 2 effectué");
		}
		
		reader.close();
	}
}
