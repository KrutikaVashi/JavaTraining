package com.homework;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SystemDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //getting current date and time using Date class
	       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));

	       
	}

}
