package _06_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String minionName, int minionEyes, String minionColor, String minionMaster){
		this.name = minionName;
		this.eyes = minionEyes;
		this.color = minionColor;
		this.master = minionMaster;
	}
	
	public String getName() {
		return "My name is " + name;
		
	}
}
