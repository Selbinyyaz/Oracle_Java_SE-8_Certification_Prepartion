package questionsV13;

public class S82 {
	
	String name;
	Boolean contract;//true, false, null
	double salary;
	
	S82(){
		//line n1
	//	this.name=new String("Joe");
	//	name="Joe";
				
	}
	
	
	public String toString() {
		return name+contract+salary;
	}
	
	public static void main(String[] args) {
		
		S82 obj= new S82();
		
		//line n2
//		obj.name="John";
//		obj.contract=true;
//		obj.salary=100;
		
		System.out.println(obj);
		
	}

}
