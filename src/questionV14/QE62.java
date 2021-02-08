package questionV14;

public class QE62 {

	public static void Test1() {
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;

		} catch (ArithmeticException ae) {
	//		ans = 0; // line n1
			// this is local variable cannot be use other block
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
	//	System.out.println("Answer = " + ans);//line n2
		
		
	}
	
	public static void Test2() {
		// second way

		int num = 10, div = 0, ans = 0;// this is instance variable

		try {
			num = 10;
			div = 0;
			ans = num / div;

		} catch (ArithmeticException ae) {
			
			ans = 0; // line n1
			
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		
		System.out.println("Answer = " + ans);// line n2

	}

	public static void main(String[] args) {
		// what is the result?

		Test1();// Compilation fails at line n1 and line2.
		
		Test2();// the output is Answer = 0

	}

}
