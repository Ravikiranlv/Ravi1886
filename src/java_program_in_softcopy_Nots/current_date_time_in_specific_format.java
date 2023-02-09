//WAP to dispaly current date time in specific format  

/*
  Now: 2023/02/09  09:59:01.487
 */
package java_program_in_softcopy_Nots;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author ravik
 *
 */
public class current_date_time_in_specific_format {
	public static void main(String[] args) {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss.SSS");
		obj.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("ISd")));
		System.out.println("Now: " + obj.format(System.currentTimeMillis()));
	}
}
