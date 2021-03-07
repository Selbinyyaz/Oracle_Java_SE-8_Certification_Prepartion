package questionV14_111_130;

public class Q111 {

	public static void main(String[] args) {
//Which three code fragments can be independently inserted at line n1 to enable the code to print One?
		// line n1
		// byte x=1;
		// short x=1;
		
		//it works cibss(char, integer, byte, short, String)rest of them will not work switch statement
		
		Integer x = new Integer("1");

		switch (x) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;
		}
	}

}
