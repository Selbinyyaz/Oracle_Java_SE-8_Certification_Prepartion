package questionV18;

public class S08 {

	public static void main(String[] args) {
		// what is the result
		
		String [][] arr= {{"A","B","C"},{"D","E"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
				if(arr[i][j].equals("B")) {
					
					continue;
				}
			}
			continue;
			
		}

	}

}
