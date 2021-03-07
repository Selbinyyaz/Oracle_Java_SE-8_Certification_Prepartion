package questionV14_111_130;

public class Q118 {

	public static void main(String[] args) {
//       Which two code fragments cause a compilation error? (Choose two.)

		float fit = 100.00F;

		float fit1 = (float) 1_11.00; // double fit1= 1_11.00;

		// Float fit2=100.00 //Float fit2=100.00F; wrapper class

		double y1 = 203.22;

		// float fit2 = y1; // float fit2 =(float) y1;

		int y2 = 100;
		float fit3 = (float) y2;
	}

}
