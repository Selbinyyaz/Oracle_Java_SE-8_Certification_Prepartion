package questionV14_64;

class Caller{
	private void init() {
		System.out.println("Initialized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
}

public class QE93TestCall {
	
	public static void main(String[] args) {
		
		Caller c= new Caller();
	//	c.start();
	//	c.init();// we cann't call private method another class
		
	}

}
