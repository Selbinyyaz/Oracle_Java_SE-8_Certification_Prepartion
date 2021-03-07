package questionV14_64;

import java.util.ArrayList;

public class QE104 {

	public static void main(String[] args) {

		ArrayList myList = new ArrayList();

		String[] myArray;

		try {
			while (true) {
				myList.add("MyString");
			}
		
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		
		} catch (Exception e) {
			System.out.println("Caught an exception");
		}
		System.out.println("Ready to use");
	}

}
