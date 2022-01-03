package org.tutorials.ProjectWithMaven;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_details")
public class Student {
	//id,name,city
	@Id
	private  int id;
	private String name;
	private String city;
	//Constructor for <----------initializing values
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//Default constructor
	public Student() {
		super();
	}
	//Getter and setter

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id+":"+this.name+":"+this.city+":";
	}
	
	

}
