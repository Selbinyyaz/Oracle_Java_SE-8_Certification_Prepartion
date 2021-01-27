package questionV14;

public class QE18 {

	public static void main(String[] args) {
		
		String [][] chs = new String [5][2];//outboundsize  
		//[2][5]--> 97, 98, 99, 100, null null null 
		//String [][] chs= {{1,2}, {3, 4}, {5,6}, {7, 8},{9, 10}}
		chs [0] = new String[2];
		chs [1]= new String[5];
		int i = 97;
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b]=""+i;
				i++;
			}
		}
		for (String[] ca:chs) {
			for(String c:ca) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
