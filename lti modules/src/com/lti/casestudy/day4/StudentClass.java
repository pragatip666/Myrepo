package com.lti.casestudy.day4;
import java.time.LocalDate;

public class StudentClass {
	
	private int Id;
	private String Name;
	private LocalDate DOB;
	
	public StudentClass(int Id, String Name, LocalDate DOB)
	{
		super();
		this.Id = Id;
		this.Name = Name;
		this.DOB = DOB;
	}
	
	
	
	public StudentClass(int id)
	{
		this.Id=Id;
		
	}
	
	public StudentClass()
	{
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public LocalDate getDob() {
		return DOB;
	}
	public void setDob(LocalDate dob) {
		this.DOB = DOB;
	}
}
	
	
	



