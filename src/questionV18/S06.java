package questionV18;

import java.io.IOException;

class X {

	public void printFileContent() throws IOException {
		// code goes here

		throw new IOException();
	}
}

public class S06 {

	public static void main(String[] args) {
		X obj = new X();
		try {
			obj.printFileContent();
		} catch (IOException e) {// will not work if Exception

		} catch (Exception e) {//IOException

		}
	}

}
