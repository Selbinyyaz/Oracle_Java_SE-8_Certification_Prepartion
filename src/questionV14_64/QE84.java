package questionV14_64;

public class QE84 {
	
	String name;
	int age;
	
	 QE84(String name) {
		
		setName(name);   //line n1
	}
	 
	 public QE84(String name, int age) {
		 
		 //QE84(name);   //line n2 will give compile time error.
		 this(name);
		 setAge(age);
		 
	}
	 //setter and getter methods go here
	 
	 public void setName(String name) {
		 
	 }
	 
	 public void setAge(int age) {
		 
	 }
	 
	 public String show() {
		 return name+ " "+age;
	 }
	

	public static void main(String[] args) {
		
		QE84 obj=new QE84("Jesse");
		System.out.println(obj.show());

	}

}
