package questionV14_64;

public class QE94 {

	String myStr = "7007";

	public void doStuff(String str) {
		
		int myNum = 0;
		
		try {
			String myStr = str;// myStr=9009;
			
			myNum = Integer.parseInt(myStr);
		
		} catch (NumberFormatException ne) {
		
			System.out.println("Error");
		}
		System.out.println("myStr: " + myStr + "myNum: " + myNum);
	}

	public static void main(String[] args) {
		QE94 obj = new QE94();
		
		obj.doStuff("9009");

	}

}
