package com.lti.day3;


import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.LocalDate;

public class stringpackages {
	private static final int MINUTE = 0;

	public static void main(String[] args) {
		int x = 65;
		String bin = Integer.toBinaryString(x);
		String oct = Integer.toOctalString(x);
		String hex = Integer.toHexString(x);
		System.out.printf("Binary from %d is %s\n", x,bin);
		System.out.printf("Octal from %d is %s\n", x,oct);
		System.out.printf("HexaDecimal from %d is %s\n", x,hex);
		
		//sqrt of 64 and any random value between  ...10
		
		System.out.println(Math.sqrt(64));
		
		int randno = (int) Math.ceil(Math.random() *10);
		System.out.println(randno);
		
		// total memory management
		Runtime r =Runtime.getRuntime();
		long totalMem= r.totalMemory() /1024/ 1024;
		long freeMem= r.freeMemory() /1024/ 1024;
		long maxMem= r.maxMemory() /1024/ 1024;
		
		System.out.println("Total memory --"+ totalMem  +  " MB approx");
		System.out.println("Free memory --"+ freeMem  +  " MB approx");
		System.out.println("Max memory --"+ maxMem  +  " MB approx");
		
		
		//time in newyork
		
		TimeZone tz = TimeZone.getTimeZone("America/New York");
		GregorianCalendar cal = new GregorianCalendar(tz);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(MINUTE);
		System.out.println("Time right now in New York is:" + hh  + mi);
		
		
		//day of the week
		
		  
		  int dd=26;
		  int mm = 6;
		  int yyyy = 2020;
		  Calendar c = Calendar.getInstance();
		  c.set(yyyy, mm - 1,dd);
		  c.set(yyyy, mm-1,dd);
		   int day = c.get(Calendar.DAY_OF_WEEK);
		   String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		   System.out.println("The day of the week is is/was" +days[day-1]);
		   
		   
		   //java 8 onwards
		   LocalDate d = LocalDate.of(yyyy, mm, dd);
		   System.out.println(d.getDayOfWeek());
		   
		   
		   //before java 8 display current date
		   SimpleDateFormat df = new SimpleDateFormat(" dd-MMMM-yyyy");
		   Date ddd= new Date();
		   String fmd = df.format(ddd);
		   System.out.println(fmd);
		   
		   
		   //new java
		   
		  
		
		
		
		
		
	}

}
