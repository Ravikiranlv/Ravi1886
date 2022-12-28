package JAVA_TESTYANTRA;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Print_month_year_date {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getMonth());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());
		System.out.println(d.getTimezoneOffset());
		System.out.println(d.getYear());
		System.out.println(d.getClass());
		SimpleDateFormat formatter = new SimpleDateFormat();
		String strDate = formatter.format(d);
		System.out.println(strDate);
	}
}