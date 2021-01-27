package questionV14;

public class QE23 {

	public static void main(String[] args) {

		int[] stack = { 10, 20, 30 };
		
		int size = 3;
	//	System.out.println(stack.length);
		
		int idx = 0;

		do {
			idx++;//0+1=1

		} while (idx < size-1);
		//        1<3-1;

		System.out.println("The top element: " + stack[idx]);

	}

}
