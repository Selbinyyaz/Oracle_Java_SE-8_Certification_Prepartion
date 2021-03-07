package questionV14_64;

public class QE107 {

	int x, y;

	public QE107(int x, int y) {// constructor
		
		initialize(x, y);
	}

	public void initialize(int x, int y) {// method
		
		this.x = x*x;
		this.y = y*y;
	}
	public static void main(String[] args) {
		
		int x=3, y=5;
		
		QE107 obj = new QE107(x, y);// local variable
		
		
		
		System.out.print(x+" "+y);
	}
}
