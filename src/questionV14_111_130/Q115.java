package questionV14_111_130;

public class Q115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Java";

		String[] str2 = { "J", "a", "v", "a" };

		String str3 = "";

		for (String str : str2) {
			str3 = str3 + str;
			// System.out.print(str3);
		}

		// str3=str1;// answer is true true

		boolean b1 = (str1.equals(str3));// answer is true false
		boolean b2 = (str1 == str3);

		System.out.println(b1 + " " + b2);

	}

}
