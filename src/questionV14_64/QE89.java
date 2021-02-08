package questionV14_64;

public class QE89 {
	public static void main(String[] args) {
		// print 54321;

		int x = 6;
		
		while(isAvailable(x)) {
			System.out.print(--x); // will print 54321
		}

	}

	public static boolean isAvailable(int x) {
		
		return --x > 0 ? true : false;

	}

}
