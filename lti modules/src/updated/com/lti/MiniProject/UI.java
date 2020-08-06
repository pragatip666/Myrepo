package updated.com.lti.MiniProject;

import java.util.Scanner;



public class UI {

       Scanner sc = new Scanner(System.in);

       private inMemoryAppEngine i = new inMemoryAppEngine();

         public static void ShowMainScreen() {

	System.out.println("Welcome User");
	
	System.out.println("Banking Solutions ");
	System.out.println("choose  what you want to know :");
	System.out.println("1.Display Yearwise Complaints");
	System.out.println("2.Display Complaints By Bank Name");
	System.out.println("3.Display Complaints By Complaint id");
	System.out.println("4.Display Complaints By days of close complaint");
	System.out.println("5.Display Complaints By complaint closed");
	System.out.println("6.Display Complaints By response time");
	System.out.println("7. Exit");
	System.out.print("\n-> Enter choice: ");
	Scanner sc = new Scanner(System.in);
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
	case 4:
		ComplaintsBydays();//call
		break;
	case 5:
		ComplaintsClosed();//call
		break;
	case 6:
		ComplaintsByResponsetime();//call
		break;
	default:
		ShowMainScreen();
	}
}
		
		private void ComplaintsClosed() {
			// TODO Auto-generated method stub
			ShowMainScreen();
			
		}

		private void ComplaintsByResponsetime() {
			ShowMainScreen();
			// TODO Auto-generated method stub
			
		}

		

		private void ComplaintsBydays() {
			// TODO Auto-generated method stub
			System.out.print("-> Enter Bank Name: ");
			String bank_name = sc.nextLine();
			ShowMainScreen();
			
		}

		private void ComplaintsByYears() {
			System.out.print("-> Enter Year: ");
			int year = Integer.parseInt(sc.nextLine());
			ShowMainScreen();
		}
		private void ComplaintsByBank() {
			System.out.print("-> Enter Bank: ");
			int Bank = Integer.parseInt(sc.nextLine());
			ShowMainScreen();
		}
		private void ComplaintsById1() {
		System.out.print("-> Enter Complaint ID: ");
		int complaint_id = Integer.parseInt(sc.nextLine());
		ShowMainScreen();
	}
		
}
		
	
			