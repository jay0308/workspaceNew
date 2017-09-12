package com.innovationm;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		long l1 = cal.getTimeInMillis();
		
		long l2 = 1504704806058l;
		//System.out.println(cal.getTimeInMillis());
		long dif = l1 - l2;
		System.out.println(dif);
		long seconds = dif%1000;
		long min = dif/1000;
		System.out.println("Seconds : "+dif/1000);
		System.out.println("minute : "+dif/60000);
		
	}

}
