package com.lti.day3;

public class Address {
	private String City;
	private int Pincode;
	
	public Address() {
		
	}
	
	public Address(String city, int pincode) {
		super();
		this.City = city;
		this.Pincode = pincode;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		this.Pincode = pincode;
	}
	

}
