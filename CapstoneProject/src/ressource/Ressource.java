package ressource;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import produit.Node;
import produit.Service;

public class Ressource {
	
	private int id;
	private String name;
	private Node node; 
	private State state;
	

	private Map<Service, Integer> services;
	private List<Instruction> Plannedfinstructions;
	
	public Ressource(int id, String name, Map<Service, Integer> services) {
		this.id = id;
		this.name = name;
		this.services = services;
		this.state = State.AVAILABLE;
		this.Plannedfinstructions = new ArrayList<Instruction>();
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNode(Node node) {
		this.node = node;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public Map<Service, Integer> getListeService() {
		return this.services;
	}

	public void setListeService(Map<Service, Integer> services) {
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
		Service service = this.getServiceByName(serviceName);

		return services.get(service);
	}
	
	public List<Entry<Integer,Integer>> availability(String serviceName, int start, int end) {
		
		List<Entry<Integer,Integer>> intervals = new ArrayList<Entry<Integer,Integer>>();
		
		Service service = this.getServiceByName(serviceName);
		
		int min = start;
		for(Instruction instruction : this.Plannedfinstructions) {
			if (instruction.start < min) {
				min = instruction.end;
			} else {
				if (instruction.start > min + services.get(service)) {
					int max = instruction.start-services.get(service);
					intervals.add(new SimpleEntry<Integer,Integer>(min,max));
					min = max+services.get(service);
				}
			}
		}
		
		return intervals;
	}
	
	public void executeInstruction(Service service, int start) {
		
		this.Plannedfinstructions.add(new Instruction(service, start, start+services.get(service)));
	}
	
	private Service getServiceByName(String serviceName) {
		for (Service service : services.keySet()) {
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
