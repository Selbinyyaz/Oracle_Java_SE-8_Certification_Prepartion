package questionV14_64;

import java.io.IOException;

class MyException extends RuntimeException {
 
	
}

public class QE85 {

	public static void main(String[] args) {
		try {
			method1(); // never will used because handles try catch block
		} catch (MyException ne) {
			System.out.println("A");
		}

	}

	public static void method1() {
		try {
			throw 2 > 10 ? new MyException() : new IOException();
		
		} catch (IOException ie) {    // en kucuk exception basl
			System.out.println("I");

		} catch (Exception re) {// en buyuk exception
			System.out.println("B");
		}
	}

}
