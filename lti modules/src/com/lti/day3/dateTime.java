package com.lti.day3;


	import java.util.Date;
	import java.text.SimpleDateFormat;
	import java.util.TimeZone;
	public class dateTime {
	
	   public static void main(String[] args) {
		//"hh" in pattern is for 12 hour time format and "aa" is for AM/PM
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		//Setting the time zone
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("India/Dehradun"));
		System.out.println(dateTimeInGMT.format(new Date()));
		
		DateFormat df = new SimpleDateFormat("dd-MM-yy");
		Calendar calobj = Calendar.getInstance();
		System.out.println(df.format(calobj.getTime()));
		
		
	   }
	   
	   
	   
	}


