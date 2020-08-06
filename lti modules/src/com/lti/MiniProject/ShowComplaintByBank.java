package com.lti.MiniProject;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  



public class ShowComplaintByBank {

	public static void main(String[] args)   
	{  
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("F:\\CSVDemo.csv"));  
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
	String[] consumers = line.split(splitBy);    // use comma as separator  
	System.out.println("Consumers [Company=" + consumers[5] + ", Issue =" + consumers[3] + "]");  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  
	}  


