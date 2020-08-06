package com.lti.casestudy.day4;

public class Course {
	private int Id;
	private String Name;
	private double Fees;
	private String Duration;
	public Course(int id, String name, double fees, String duration) {
		super();
		Id = id;
		Name = name;
		Fees = fees;
		Duration = duration;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	

}
