package questionV14;

public class QE35 {

	public static void main(String[] args) {
		// what is the result
		
		int num1[] = {1, 2, 3};
		int num2[]= {1, 2, 3, 4, 5};
		
		num2=num1;// nums assigned {1, 2, 3}
		
		for(int x:num2) {
			System.out.print(x+"  :");
		}

	}

}
