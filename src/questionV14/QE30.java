package questionV14;

public class QE30 {

	public static void main(String[] args) {
		
		int x=1; 
		int y=1;
		if(x++<++y) {//1<2
			System.out.print("Hello ");
		}else {
			System.out.print("Welcome ");
		}
		System.out.print("Log "+x+" : "+y);
	}

}
