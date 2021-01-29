package questionV14;

public class QE33 {

	public static boolean isAvaliable(int x) {
		return x-- > 0 ? true : false;
	}

	public static void main(String[] args) {
		// which modification enables the code to print 5 4 3 2 1

		int x = 5;
		while (isAvaliable(x)) {
		//	--x; will be --> 4, 3, 2, 1
			System.out.println(x);
			
			x--;
		}

	}

}
