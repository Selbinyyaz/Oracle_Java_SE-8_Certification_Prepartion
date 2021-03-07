package questionV18;

public class S33 {

	String name;
	boolean contract;
	double salary;
	
	 S33() {
		// line n1
		 
//		 this.name= new String("Joe");
//		 this.contract= new Boolean(true);
		 
//		 name="Joe";
//		 contract=true;
//		 salary=100.0;
		// this("Joe", true, 100);there is not constructor
		 
		 
	}
	 public String toString() {
		 return name+" : "+contract+" : "+salary;
	 }
	 
	 public static void main(String[] args) {
		
		 S33 obj= new S33();
		// obj.name="Joe";
		 
		 System.out.println(obj);
		
		
	}
}
