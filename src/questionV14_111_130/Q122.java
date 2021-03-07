package questionV14_111_130;

import java.time.LocalDate;

public class Q122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2012, 1, 30);// days=30 
		
		//date=date.plusDays(10);// 30+10==>31, 1, 2, 3, 4, 5 ,6, 7, 8, 9 anwer will be 2012-02-09
		
		date.plusDays(10); // so didn't assigned answer will be 2012-01-30
		
		System.out.println(date);

	}

}
