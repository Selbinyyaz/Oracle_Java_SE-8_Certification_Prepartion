package questionsV13;

public class S01 {
	
	public void test() {
		System.out.println("Base");
	}

}
class DerivedA extends S01{
	public void test() {
		System.out.println("DerivedA ");
	}
}
class DerivedB extends DerivedA{
	public void test() {
		System.out.println("DerivedB ");
	}
	
	public static void main(String[] args) {
		S01 b1=new DerivedB();
		S01 b2= new DerivedA();
		S01 b3= new DerivedB();
	//	b1.test();b2.test();b3.test();--> will not compile
		b1= (S01) b3; // casting
		S01 b4 = (DerivedA) b3;
		
		b1.test();
		b4.test();
		
		
	}
}