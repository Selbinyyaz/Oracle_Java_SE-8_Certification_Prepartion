package questionV18;

public class S53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1[][]=new int [3][1];//row column
		 //row column
//		num[0][0]=10;
//		num[1][0]=10;
//		num[2][0]=10;
		
	
		int num[][]=new int [1][3];
		// row column 
		num[0][0]=10;
		num[0][1]=10;
		num[0][2]=10;
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=10;
				
				System.out.println(num[i][j]);
				
			}
		}

	}

}
