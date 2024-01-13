package com.qa.tn_part1_util;

import java.util.Date;

public class Util {
	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", ":").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}
	
	public static final int IMPLICIT_WAIT_TIME = 40;
	public static final int PAGE_LOAD_TIME = 500;
	public static final int SCRIPT_TIME= 1500;

}


