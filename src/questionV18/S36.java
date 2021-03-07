package questionV18;

public class S36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"A","B","C","D"};
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
			if(arr[i].equals("C")) {
				break;
			}
			System.out.println("Work Done");
			continue;
		}

	}

}
