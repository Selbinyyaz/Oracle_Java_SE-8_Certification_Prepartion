package questionV14;

public class QE32 {

	public static void main(String[] args) {
		// what is the result if the integer aVar is 9?

		int aVar = 9;

		if (aVar++ < 10) {// 9<10
			System.out.println(aVar + " Hello Universe! ");// aVar=10
		} else {
			System.out.println(aVar + " Hello World!");
		}

	}

}
