package questionV14;

public class QE43 {

	public static void main(String[] args) {
		
		String str=" ";
		
	//	System.out.println(str.equals(""));// will return false
		
		str.trim();  // needs to assign str=str.trim();
		
		System.out.println(str.isEmpty());// there is space so is not empty
		
		System.out.println(str.equals("")+" "+str.isEmpty());
		 

	}

}
