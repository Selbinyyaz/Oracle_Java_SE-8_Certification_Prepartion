package questionV14_111_130;

public class Q123 {

	int a1;

	public static void doProduct(int a) {// this method not work because there is no return
		a = a * a;
	}

	public static void DoString(String s) {
		s.concat(" " + s);
	}

	public static void main(String[] args) {

		Q123 obj = new Q123();

		obj.a1 = 11; // assigned intance variable

		String sb = "Hello";

		Integer i = 10;
		
		doProduct(i);// there of them are not work

		DoString(sb);

		doProduct(obj.a1);

		System.out.println(i + " " + sb + " " + obj.a1);

	}

}
