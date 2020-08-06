package com.lti.day3;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Calendar;
	import java.util.Date;

	public class AgeFind {
	 public static void main(String[] args) throws ParseException {
	 
	  //using Calendar Object
	  String s = "1994/06/23";
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	  Date d = sdf.parse(s);
	  Calendar c = Calendar.getInstance();
	  c.setTime(d);
	  int year = c.get(Calendar.YEAR);
	  int month = c.get(Calendar.MONTH) + 1;
	  int date = c.get(Calendar.DATE);
	  LocalDate l1 = LocalDate.of(year, month, date);
	  LocalDate now1 = LocalDate.now();
	  Period diff1 = Period.between(l1, now1);
	  System.out.println("age:" + diff1.getYears() + "years");
	 }
	} 


