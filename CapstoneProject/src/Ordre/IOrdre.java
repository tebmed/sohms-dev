package Ordre;

import java.util.List;

import Ressource.RessourceManager;

public interface IOrdre {
	public default void helloWorld(){
		System.out.println("HelloWorld");
	}
	
	public List<String> getInstructons(String start, String end);
}
