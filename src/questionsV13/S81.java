package questionsV13;

public class S81 {

	public static void main(String[] args) {
		

		String[] arr= {"A","B","C","D"};
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+" ");// will print A
			
			if(arr[i].equals("C")) {// A will not enter if loop
				continue;
			}
			
			System.out.println("Well done");
			break;
		}

	}

}
