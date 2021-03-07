package questionsV13;

public class S67 {
	
	int x, y;
	
	public S67(int x, int y) {
		initialize(x, y);
	}

	public void initialize(int x, int y) {
		this.x=x*x;
		this.y=y*y;
	}
	
	public static void main(String[] args) {
		
		int x=3; int y=5;
		
		S67 obj = new S67(x, y);
		
		System.out.println(x+" "+y);//3 5
		
		System.out.println(obj.x+" "+obj.y);// 9 25
		
		
	}
}
