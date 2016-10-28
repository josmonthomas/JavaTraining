package net.opentrends.javatraining.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	//http://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
	
	public static void main(String[] args) throws ParseException {
		//Convert current date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date= sdf.format(new Date());
		System.out.println(date);
		//------------------------------------------------
		
		//Convert String to Date
		SimpleDateFormat sdf1= new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		String date2="23-Oct-2015 14:45:59";
		Date dateVal=sdf1.parse(date2);
		System.out.println(dateVal);
		
		//Format the current date value
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MMM/yyyy");
		Date date3= new Date();
		System.out.println(sdf.format(date3));
		
		//Convert Calendar to Date
		Date date4= Calendar.getInstance().getTime();
		System.out.println(date4);
		
		//Add or subtract from a date
		SimpleDateFormat sdf5= new SimpleDateFormat("yyyy mm dd");
		Calendar calendar = new GregorianCalendar(2015,12,24);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH,3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.YEAR,-10);
		System.out.println(calendar.getTime());
		 
		
	}

}
