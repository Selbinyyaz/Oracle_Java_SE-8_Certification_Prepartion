package questionV14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QE55 {

	public static void main(String[] args) {
		// Assume that the system date March 12, 2021
		LocalDate date1=LocalDate.now();//obtains current date
		
		LocalDate date2= LocalDate.of(2021, 02, 14);
		
		LocalDate date3= LocalDate.parse("2021-03-12", DateTimeFormatter.ISO_DATE);
		// if you use DateTimeFormatter.ISO_DATE_TIME, you need to put time also
		
		
		
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);

	}

}
