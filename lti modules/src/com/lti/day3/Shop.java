package com.lti.day3;

public class Shop extends Property{
	private int LisenceNo;
	
	public Shop() {
	}
	
	public Shop(Address address, String area, int lisenceNo) {
		super(address, area);
		this.LisenceNo = lisenceNo;
	}

	public int getLisenceNo() {
		return LisenceNo;
	}

	public void setLisenceNo(int lisenceNo) {
		this.LisenceNo = lisenceNo;
	}
	
	

}
