package questionV14;

public class QE26 {

	public static void main(String[] args) {
		
		//intance variable==> inside the class but outside a method or constractor 
		//local variable==> inside the method or constructor
		
		int var1=200;// local variable so will not affected
		System.out.print(doCalc(var1));// 400
		
		System.out.println(" "+var1);// 200
	}
	
	static int doCalc(int var1) {
		var1=var1*2;// local variable 
		return var1;
	}

}
