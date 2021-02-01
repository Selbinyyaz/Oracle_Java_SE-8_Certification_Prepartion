package questionV14;

public class QE37 {

	public static void main(String[] args) {
		//what are the values each element?
		
		int [] intArr= {15,30,45,60,75};
		intArr[2]=intArr[4];
		intArr[4]=90;
		
		for (int i : intArr) {
			System.out.print(i+ " ");
		}
		

	}

}
