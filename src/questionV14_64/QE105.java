package questionV14_64;

public class QE105 {

	int x, y;// intance variable will call creating object 

	public QE105(int x, int y) {// constructor
		initialize(x, y);

	}

	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		
		int x=9, y=5;//local variable
		
		QE105 obj= new QE105(x, y);//local variable
		
		System.out.println(x+" "+y);//local variable
	}

}
