package questionsV13;

import java.io.IOException;

public class S69 {
	
	public void printFileContent() throws IOException {
		//code goes here
		
		throw new IOException();//check exception needs to be handle 
	}

}
class Test {
	public static void main(String[] args) throws IOException {
		S69 obj= new S69();
		obj.printFileContent();
	}
}
//which to modifications should you make so that the code compiles successfully?