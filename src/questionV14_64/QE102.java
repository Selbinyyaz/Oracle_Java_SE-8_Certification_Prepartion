package questionV14_64;

public class QE102 {

	public static void main(String[] args) {
		// what is the result?

		StringBuilder sb = new StringBuilder("Java");// will use heap memory
	
		String s = "Java";// will use stack memory 
		
		//System.out.println(sb);// will print java

		if (sb.toString().equals(s.toString())) {
			System.out.println("Match 1");
		} else if (sb.equals(s)) { // not equal because different memory also stringbuilder there is not equal method
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}

		
		
		// 2nd way 
		
//		StringBuilder sb = new StringBuilder(5);// will use heap memory
//		
//		String s = " ";// will use stack memory 
//		
//		//System.out.println(sb);// will print java
//
//		if (sb.toString().equals(s.toString())) {
//			System.out.println("Match 1");
//		} else if (sb.equals(s)) { // not equal because different memory also stringbuilder there is not equal method
//			System.out.println("Match 2");
//		} else {
//			System.out.println("No Match");
//		}
	}
	

}
