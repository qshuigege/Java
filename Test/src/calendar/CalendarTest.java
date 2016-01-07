package calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.SUNDAY);
		c.set(1988, 0, 11);
		c.set(Calendar.HOUR, 17);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		
		Date date = c.getTime();
		System.out.println(date);
	}
}
