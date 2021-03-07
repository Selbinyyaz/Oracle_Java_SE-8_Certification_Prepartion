package questionV18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class S03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date=LocalDate
				.parse("2014-05-04")//there is no compile time error
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);

	}

}
