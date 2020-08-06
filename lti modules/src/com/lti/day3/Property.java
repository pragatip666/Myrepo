package com.lti.day3;

public class Property {
	
	private Address Address;
	private String Area;
	
	
	public Property() {
	
	}
	
	public Property(Address address, String area) {
		super();
		Address = address;
		this.Area = area;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		this.Area = area;
	}

	
	


}
