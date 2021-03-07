package questionV18;

public class S15 {

	public static void main(String[] args) {
		// Which code fragment, when inserted at line 9, enables the code to print true?
		
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
		System.out.println(str1==str2);
	}

}
