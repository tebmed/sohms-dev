package application;

import java.io.IOException;
import sohms.communication.WebGUI;
import sohms.communication.WorkshopSimulation;


public class Main {

	public static void main(String[] args) {

	   try {
		    //1--Create an instance from the workshop
			WorkshopSimulation arena = new WorkshopSimulation(1212, "127.0.0.1");
			//2--Create an instance from the Web Interface
			WebGUI wg = new WebGUI(8003);
			//3--Create an instance from the sohms system
			InitialisationSysteme sohms = new InitialisationSysteme(arena, wg);
			//4--Make the system as an observer for the received scenrios by the gui
			wg.getScenario1().addObserver(sohms);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
