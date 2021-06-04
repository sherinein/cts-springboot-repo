package com.cts.springmvc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) {
		Date d=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			d=sdf.parse(date);
		} catch (ParseException e) {

			e.printStackTrace();

		}
		return d;

	}
}
