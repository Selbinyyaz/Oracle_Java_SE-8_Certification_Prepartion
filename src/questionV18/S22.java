package questionV18;

public class S22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;// needs to be initialized
		
		try {
			int num=10;
			int div=0;
			ans=num/div;
		} catch (ArithmeticException ae) {
			ans=0;//line n1
		}catch(Exception e) {
			System.out.println("Invalid calculation");
		}
     //    System.out.println(ans);//line n2
	}

}
