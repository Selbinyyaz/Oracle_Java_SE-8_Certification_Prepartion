package questionV14_64;

public class QE106 {

	public static void main(String[] args) {

		QE106 obj = new QE106();
		System.out.print(isAvaliable + " ");// false

		isAvaliable = obj.doStuff();
		System.out.println(isAvaliable);// true

	}

	public static boolean doStuff() {

		return !isAvaliable;// (if not false== true)

	}

	static boolean isAvaliable = false;
}
