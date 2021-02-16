package com.common.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CommonUtil {

	
	public static String getCurrency(int data){
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.KOREA);
		return format.format(data);
	}
	
	public static String getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	
	
	public static String getDate(Date d){
		String formatData = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		formatData = sdf.format(d.getTime());
		return  formatData;
	}

	
}
