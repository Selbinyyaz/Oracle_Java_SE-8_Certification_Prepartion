package questionV14_111_130;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q167 {

	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.of(2014, 4,30, 1, 1);//attention LocalDate and LocalDateTime
		
		dt.plusDays(30);
		
		dt.plusMonths(1);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}

}
