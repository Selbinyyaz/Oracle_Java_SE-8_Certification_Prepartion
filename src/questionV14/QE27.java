package questionV14;

public class QE27 {
	
	public static int stVar = 100;// instance variable
	public int var = 200;

	public String toString() {
		return stVar + ":" + var;//  100:300
		                         //300: 200;
	}
	
	public static void main(String[] args) {
		
		QE27 obj=new QE27();
		obj.var=300;
		System.out.println(obj);
		
		QE27 obj1=new QE27();
		obj1.stVar=300;
		System.out.println(obj1);
		
	}

}
