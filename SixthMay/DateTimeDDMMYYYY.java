/*Program to print current date and time with pattern DD:MM:YYYY hh:mm:ss*/
import java.text.*;
import java.util.*;
public class DateTimeDDMMYYYY {

	public static void main(String[] args) {
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
		Date date = new Date();
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(formatDate.format(date));
	}

}
