package questionV18;

public class S17 {
	int x;
	int y;
	
	public S17(int x, int y) {//constructor
		initialize(x, y);
		
	}
	
	public void initialize(int x, int y) {//method
		this.x=x*x;
		this.y=y*y;
	}
	
	public static void main(String[] args) {
		int x=3;
		int y=5;
		
		S17 obj= new S17(x, y);
		
	//	System.out.print(x+" "+y);
		
		System.out.print(obj.x);
	}

}

