package questionsV13;

public class S64 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading card");
	}
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Reading card");
	}
	
	public static void main(String[] args) throws Exception {
		S64 ex= new S64();
		int cardNo=12344;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);// this will give compile error
	}
}
