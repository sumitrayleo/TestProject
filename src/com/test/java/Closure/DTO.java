package com.test.java.Closure;

public class DTO {
	int id;
	String name;
	String gender;
	String state;
	
	
	
	@Override
	public String toString() {
		return "DTO [id=" + id + ", name=" + name + ", gender=" + gender + ", state=" + state + "]";
	}
	public DTO(int id, String name, String gender, String state) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
