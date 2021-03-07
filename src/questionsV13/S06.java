package questionsV13;

public class S06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean[] bool = new Boolean[3];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));// return ((s != null) && s.equalsIgnoreCase("true"));
		bool[1] = new Boolean(null);// false

		System.out.println(bool[0] + " " + bool[1]);
	}

}
