package questionV14_111_130;

public class Q169 {
	public static void main(String[] args) {
		System.out.println("Helo " + new StringBuilder("Java SE 8"));
		System.out.println("Helo " + new MyString("Java SE 8").msg);//referance kullanmadan obj cagiryor
//		
		// StringBuilder st= new StringBuilder("Java SE 8"); will not print

	}

}

class MyString {
	String msg;

	MyString(String msg) {
		this.msg = msg;
	}
}
