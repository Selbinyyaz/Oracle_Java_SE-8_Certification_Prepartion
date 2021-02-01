package questionV14;

public class QE46 {

	public static void main(String[] args) {
		// what is the result?
		
		
		
		String names[]= {"Thomas", "Peter", "Joseph"};
		String pwd[]=new String[3];
		int idx=0;
		
		try {
			for(String n: names) {
				pwd[idx]=n.substring(2, 6);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("Invalid name");
		}
     for (String p : pwd) {
	System.out.println(p);
}
	}

}
