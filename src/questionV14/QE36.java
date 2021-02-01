package questionV14;

public class QE36 {

	public static void main(String[] args) {
		// when inserted at line 1, enables the ap class to print Equal?

		String str1 = "Java";
		String str2 = new String("java");// when we use new keyword that everytime will create new object
		// line n1==> so we cant use == equal sign

		if (str2.equals(str1.toLowerCase())) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
