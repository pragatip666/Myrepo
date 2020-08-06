package com.lti.day3;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day {
   public static void main(String[] argv) throws Exception {
      Format dateFormat = new SimpleDateFormat("EEE, dd-MMMM-yyyy");
      String res = dateFormat.format(new Date());
      System.out.println("Date = " + res);
   }
}