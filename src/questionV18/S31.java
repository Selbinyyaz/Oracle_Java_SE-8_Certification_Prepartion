package questionV18;

public class S31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[]= {1, 2, 3};
		int array2[]=new int [5];
		
		array2=array1;// this will be 1, 2, 3
		
		for (int i : array2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		int array3[]=new int [3];
		array3=array2;
		
		for (int i : array3) {
			System.out.print(i+" ");
		}

	}

}
