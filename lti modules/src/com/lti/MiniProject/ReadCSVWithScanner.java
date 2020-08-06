package com.lti.MiniProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVWithScanner {
	public static List<Complaints> complaints = new ArrayList<Complaints>();

	private static final CharSequence Date_received = null;

	public static void main(String[] args) throws IOException {
		// open file input stream
		BufferedReader reader = new BufferedReader(new FileReader(
				"Complaints.csv"));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Complaints> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			Complaints emp = new Complaints();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
				String data = scanner.next();
				if (index == 0)
				
				//String dob=sc.nextLine();
				emp.setDate_received(LocalDate.parse(Date_received,formatter));
				
					//emp.setLocalDate.Of(Integer.parseInt(data));
				else if (index == 1)
					emp.setProduct(data);
				else if (index == 2)
					emp.setIssue(data);
				else if (index == 3)
					emp.setCompany(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		
		
		reader.close();
		
		System.out.println(empList);
		
	}
	public void addcomplaints(Complaints complaint) {
		complaints.add(complaint);
	}

}



