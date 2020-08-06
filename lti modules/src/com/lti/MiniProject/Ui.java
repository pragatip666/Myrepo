package com.lti.MiniProject;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;



public class Ui {
	   Scanner sc = new Scanner(System.in);
		//List<Complaints> complaints = ReadCSVfile.readCSV(csvFile);
	   public static void mainScreen()  
		{  
			Scanner console = new Scanner(System.in);

			CSVReader reader = null;  
			try {  
		
				reader = new CSVReader(new FileReader("F:\\Complaints.csv"));  
				String [] nextLine;  
				//reading one line at a time  
				while ((nextLine = reader.readNext()) != null) { 
					Date_received.add(ld);
					
					
//					System.out.println(nextLine[1]);
					Product.add(nextLine[1]);
		
					subProduct.add(nextLine[2]);

					issue.add(nextLine[3]);

					subIssue.add(nextLine[4]);

					company.add(nextLine[5]);

					state.add(nextLine[6]);
			
					zipCode.add(nextLine[7]);
					
					submittedVia.add(nextLine[8]);
					
					dateSentToCompany.add(nextLine[9]);
					
					companyResponseToConsumer.add(nextLine[10]);
					
					timelyResponse.add(nextLine[11]);
			
					consumerDisputed.add(nextLine[12]);
					
					complaintId.add(nextLine[13]);
				}  
			}  
			catch (Exception e) {  
				e.printStackTrace();  
			}
			
			Date_received.remove(0);
			Product.remove(0);
			subProduct.remove(0);
			issue.remove(0);
			subIssue.remove(0);
			company.remove(0);
			state.remove(0);
			zipCode.remove(0);
			submittedVia.remove(0);
			dateSentToCompany.remove(0);
			companyResponseToConsumer.remove(0);
			timelyResponse.remove(0);
			consumerDisputed.remove(0);
			complaintId.remove(0);
				}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		  public static void ShowmainScreen() {
			
					System.out.println("Banking Solutions ");
					//System.out.println("choose  what you want to know :");
					System.out.println("1.Yearwise Complaints");
					System.out.println("2.Complaints By Bank Name");
					System.out.println("3. Complaints By Complaint id");
					System.out.println("4. Show number of days took by the Bank to close the complaint ");
					System.out.println("5. Show all the complaints closed");
					System.out.println("6. Show all the complaints which received a timely response");
					System.out.println("7. Take input from user for storing new complaints");
					System.out.println("8. Exit");
					System.out.print("\n-> Enter choice: ");
					int choice = Integer.parseInt(sc.nextLine());
					switch(choice) {
					
					case 1: 
						ComplaintsByYears(); // call 
						break;
					
					case 2: 
						ComplaintsByBank();  //call
						break;
						
					case 3:
						ComplaintsById1();//call
						break;	
					case 4:DaysBankNeeded();
					       break;
					 case 5:
						Complaintclosed();//call
								break;	
					case 6:CompaintTimelyresponse();
							  break;
					 case 7:
					    IsComplaint();//call
									break;
					       
					
							
						
					 default:
						 ShowmainScreen();	
					
					}
					
					

				}

		

		private static void CompaintTimelyresponse() {
			eus.complaintsReceievedTimelyResponse(Complaints);
			ShowmainScreen();
			// TODO Auto-generated method stub
			
		}



		private static void DaysBankNeeded() {
			System.out.print("-> Enter Bank Name: ");
			String bank_name = sc.nextLine();
			eus.daysToCloseComplaint(complaints, bank_name);
			ShowmainScreen();
			// TODO Auto-generated method stub
			
		}



		private static void Complaintclosed() {
			// TODO Auto-generated method stub
			
		}

		private static void IsComplaint() {
			// TODO Auto-generated method stub
			
		}

		private static void ComplaintsById1() {
			System.out.print("-> Enter Complaint ID: ");
			int complaint_id = Integer.parseInt(sc.nextLine());
			eus.complaintsBasedOnID(complaints, complaint_id);
			ShowmainScreen();
		
			// TODO Auto-generated method stub
			
		}

		private static void ComplaintsByBank() {
			System.out.print("-> Enter Bank Name: ");
			String bank_name = sc.nextLine();
			eus.complaintsBasedOnBank(complaints, bank_name);
			ShowmainScreen();
			// TODO Auto-generated method stub
			
		}

		private static void ComplaintsByYears() {
			System.out.println("Enter Year\n");
			String inputYear = console.nextLine();
			String date = Date_received.get(0);
			System.out.println(date);
			System.out.println(inputYear);
			
			for(int i = 0;i<Date_received.size();i++) {
				if(dateReceived.get(i).substring(6).equals(inputYear)) {
					System.out.println(complaintId.get(i));
			
	}
				}

}



		