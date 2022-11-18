package com.anudip.Assignment;

public class Agent {

	private int id;
	private String Name;
	private String commission;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public Agent(int id, String name, String commission) {
		super();
		this.id = id;
		Name = name;
		this.commission = commission;
	}
}
