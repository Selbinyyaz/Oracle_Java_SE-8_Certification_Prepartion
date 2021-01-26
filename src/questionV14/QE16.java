package questionV14;

public class QE16 {

	public static void main(String[] args) {
		
		String[][] arr= {{"A", "B", "C"},{"D","E"}};
		
		String[][] arr1=new String[2][3];//row, column
		
		arr1[0][0]="A";
		arr1[0][1]="B";
		arr1[0][2]="C";
		
		arr1[1][0]="D";
		arr1[1][1]="E";
		 
		
		
		for (int i = 0; i < arr.length; i++) {//row
			for (int j = 0; j < arr[i].length; j++) {//column
				System.out.print(arr1[i][j]+" ");
				
				if(arr1[i][j].equals("B")) {
					continue; 
				}
			}
			continue;
		}
		

	}

}
