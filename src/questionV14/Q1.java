package questionV14;

public class Q1 {
	
	public static void main(String[] args) {
		
		Boolean[] bool= new Boolean[2];
		bool [0] = new Boolean(Boolean.parseBoolean("True"));
		// if you dont write true, others will be false
		//true, True can write that is equalsIgnoreCase("true")
		
		bool [1]= new Boolean(null);// everytime null is false
		
		System.out.println(bool[0]+ " "+bool[1]);
		
	}

}
