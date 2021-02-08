package questionV14_64;

public class QE82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] chs= new String[2][];
		
		chs[0]=new String[2];
		chs[1]=new String[5];
		int a=97;
		
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				chs[i][j]=" "+a;
			
			//	System.out.println(a); answer will be 97 98 99 100
				
				a++;
			}
		}
		
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c+" ");
				
			}
			System.out.println();
		}

	}

}
