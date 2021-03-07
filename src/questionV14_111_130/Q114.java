package questionV14_111_130;

public class Q114 {
	public static void main(String[] args) {

		int numbers[];
		numbers = new int[2];// this will ignore it because new object is created

		numbers[0] = 10;
		numbers[1] = 20;

		numbers = new int[4];
		//we assume that there is numbers[0] numbers[1] but not assigned
		numbers[2] = 30;
		numbers[3] = 40;
		
		for (int x : numbers) {
			System.out.print(" " + x); //answer will be 0 0 30 40 
		}
	}
}
