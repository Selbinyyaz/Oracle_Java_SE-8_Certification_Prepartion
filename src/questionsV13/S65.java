package questionsV13;

public class S65 {
//	String name;
//	int age;
//
//	void S65() {// this is method
//		S65("James", 25);
//	}
//
//	void S65(String name, int age) {// this is method
//		this.name = name;
//		this.age = age;
//	}
//	
//	public static void main(String[] args) {
//		S65 s= new S65();
//		System.out.println(s.age+s.name);
//	}

	int x;
	int y;
	
	public void doStuff(int x, int y) {
		
		this.x=x;
		
		y=this.y;
		
	}
	public void display() {
		
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		
		S65 m1= new S65();
		m1.x=100;
		m1.y=200;
		m1.display();//100 200 
		
		S65 m2= new S65();
		m2.doStuff(m1.x, m1.y);
		
		m2.display();//100, 0
	}
	
}
