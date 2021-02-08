package questionV14_64;

public class QE87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  [][] n = {{1, 3},{2,4}};
		
		System.out.println(n.length);
		
		for(int i=n.length-1;i>=0;i--) {
			for(int j=n[i].length-1;j>=0;j-- ) {
				System.out.print(n[i][j]);
			}
		}
		

	}

}
