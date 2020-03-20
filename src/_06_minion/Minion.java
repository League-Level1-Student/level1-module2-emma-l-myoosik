package _06_minion;

import java.util.Scanner;

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
		return name;
		
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaster() {
		return master;
	}
	
	public String setMaster(String a) {
		Scanner master = new Scanner(System.in);
		System.out.println("Set Master: ");
		String s = master.next();
		master.close();
		return s;
	}
}
