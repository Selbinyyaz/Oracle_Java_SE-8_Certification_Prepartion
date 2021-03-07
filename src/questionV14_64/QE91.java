package questionV14_64;

public class QE91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Short s1= 200;
		Integer s2=400;
		//String s3=(String)(s1+s2); //line n1 compile error cannot cast int to string 
		Long s4=(long) s1+s2;  //line n2
		
		System.out.println("Sum is "+s4);
		
	}

}
