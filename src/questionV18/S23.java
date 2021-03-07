package questionV18;

public class S23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char colorCode = 'y';

		switch (colorCode) {

		case 'r':
			int color = 100;// this one is local variable
			break;

		case 'b':
			color = 10;
			break;

		case 'y':
			color = 1;
			break;
		}
		// System.out.println(color); cannot use local variable outside block
	}

}
