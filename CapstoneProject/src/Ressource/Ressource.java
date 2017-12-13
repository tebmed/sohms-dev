package Ressource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.*;
import java.util.AbstractMap.SimpleEntry;

import Produit.Node;
import Produit.Service;

import Produit.Service;

public class Ressource {
	
	private int id;
	private Node node;
	private List<Service> services;
	private List<Instruction> instructionsPlanned;
	
	public Ressource(int id, List<Service> services) {
		this.id = id;
		this.services = services;
		this.instructionsPlanned = new ArrayList<Instruction>();
	}

	public int getId() {
		return id;
	}
	
	public void setNode(Node node) {
		this.node = node;
	}

	public List<Service> getListeService() {
		return this.services;
	}

	public void setListeService(List<Service> services) {
		this.services = services;
	}
	
	public String toString() {
		String s = "";
		for(int i=0;i<this.services.size();++i)
			s += this.services.get(i).toString();
		
		return s + "\n";
	}
	
	public Node getNode() {
		return this.node;
	}
	
	public Integer getExecutionTime(String serviceName) {
		for(Service service : services) {
			if (service.getName().equals(serviceName)) {
				return service.getDuration();
			}
		}
		return null;
	}
	
	public List<Entry<Integer,Integer>> availability(String serviceName, int start, int end) {
		
		List<Entry<Integer,Integer>> intervals = new ArrayList<Entry<Integer,Integer>>();
		
		Service service = this.getServiceByName(serviceName);
		
		int min = start;
		for(Instruction instruction : this.instructionsPlanned) {
			if (instruction.start < min) {
				min = instruction.end;
			} else {
				if (instruction.start > min + service.getDuration()) {
					int max = instruction.start-service.getDuration();
					intervals.add(new SimpleEntry<Integer,Integer>(min,max));
					min = max+service.getDuration();
				}
			}
		}
		
		return intervals;
	}
	
	public void executeInstruction(Service service, int start) {
		
		this.instructionsPlanned.add(new Instruction(service, start, start+service.getDuration()));
	}
	
	private Service getServiceByName(String serviceName) {
		for (Service service : services) {
			if (service.getName() == serviceName) {
				return service;
			}
		}
		return null;
	}
	
	class Instruction {
		
		private Service service;
		private int start;
		private int end;
		
		public Instruction(Service service, int start, int end) {
			this.service = service;
			this.start = start;
			this.end = end;
		}
		
		public Service getService() {
			return this.service;
		}
		
		public int getStart() {
			return this.start;
		}
		
		public int getEnd() {
			return this.end;
		}
	}
}
