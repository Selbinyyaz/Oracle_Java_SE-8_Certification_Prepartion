package questionsV13;

public class S72 {
	
	int count;
	public static void displayMsg() {// in static method just accept static variable
//		count++;        will give compile error
//		System.out.println("Welcome "+count);
	}
	public static void main(String[] args) {
		S72.displayMsg();
		displayMsg();
	}

}
