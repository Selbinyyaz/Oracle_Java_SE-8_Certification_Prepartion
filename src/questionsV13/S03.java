package questionsV13;

public class S03 {
	
	String name;
	int age=25;
	
	public S03() {
		
	}
	
//	public S03(String name) {
//		this();
//		setName(name);
//	}
	public S03(String name, int age) {
	//	S03(name);
	//	setAge(age);
	}
//setter and getter methods go here
	public String show() {
		return name+" "+age;//+" "+number;
	}
	public static void main(String[] args) {
		//S03 s1=new S03("Jesse");
		S03 s2=new S03("Walter", 52);
		//System.out.println(s1.show());
		System.out.println(s2.show());
	}
	
}
