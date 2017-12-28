package communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ComArena {
	
	/**
	 * Port utilise par arena
	 */
	private final int port = 1202;
	
	/**
	 * Addresse de la machine faisant tourner arena
	 */
	private final String arenaAddresse = "127.0.0.1";
	private Socket socketArena;
	
	BufferedReader in;
	PrintStream out;
	
	//constantes utilisees pour construire les messages a transmetre
	
	private final static String AGV = "AGV";
	private final static String DEPL = "DEPL";
	private final static String CHARGE = "CHARGE";
	private final static String DECHARGE = "DECHARGE";
	private final static String ACTION = "ACTION";
	private final static String STA = "STA";
	private final static String AXIS = "AXIS";
	private final static String I_COMP = "I_COMP";
	private final static String R_COMP = "R_COMP";
	private final static String L_COMP = "L_COMP";
	private final static String SCREW_COMP = "SCREW_COMP";
	private final static String PLATE_LOAD = "PLATE_LOAD";
	private final static String PLATE_UNLOAD = "PLATE_UNLOAD";
	private final static String DELIM = ":";
	
	
	public ComArena() {
		try {
			this.socketArena = new Socket(InetAddress.getByName(arenaAddresse), port);
		
			this.in = new BufferedReader(new InputStreamReader(socketArena.getInputStream()));
			this.out = new PrintStream(socketArena.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void sendMessage(String message) {
		this.out.println(message);
	}
	
	public void charge(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(CHARGE).append(DELIM)
		.append(stationId);
		
		this.sendMessage(sb.toString());
	}
	
	public void decharge(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(DECHARGE).append(DELIM)
		.append(stationId);
		
		this.sendMessage(sb.toString());
	}
	
	public void deplAgv(int agvId, int destId) {
		StringBuilder sb = new StringBuilder();
		sb.append(AGV).append(DELIM)
		.append(DEPL).append(DELIM)
		.append(agvId).append(DELIM)
		.append(destId);
		
		this.sendMessage(sb.toString());
	}
	
	public void axis(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(AXIS).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void iComp(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(I_COMP).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void rComp(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(R_COMP).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void lComp(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(L_COMP).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void screw(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(SCREW_COMP).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void plateLoad(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(PLATE_LOAD).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}
	
	public void plateUnLoad(int stationId) {
		StringBuilder sb = new StringBuilder();
		sb.append(STA).append(DELIM)
		.append(ACTION).append(DELIM)
		.append(PLATE_UNLOAD).append(DELIM)
		.append(stationId);

		this.sendMessage(sb.toString());
	}

}
