package questionV18;

public class S46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int b=2;
		int c=1;
		
		int r1=a*b/c+1;// bodmas rule== bracket, Power, division, multiplication, addition, substraction
		
		System.out.println(r1);
		
		int r2=a/b*c+1;   //3/2*1+1
		System.out.println(r2);
		
		int r3=a*(b/(c+1));
		System.out.println(r3);

	}

}
