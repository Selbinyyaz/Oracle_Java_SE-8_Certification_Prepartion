package questionV18;

public class S55 {

	public static boolean isAvaliable(int x) {
		return x-- > 0 ? true : false;
	}

	public static void main(String[] args) {
		// Which modification enables the code to print 54321?

		int x = 5;
		while (isAvaliable(x)) {

			System.out.println(x);

		}

	}

}
