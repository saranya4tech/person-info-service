package com.example.demo.models;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	private int personId;
	private String personName;
	private String description;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Person(int personId, String personName, String description) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.description = description;
	}
	
	

}
