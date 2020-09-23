package questionsV13;

public class S03 {
	
	public static void main(String[] args) {
		S03 obj=new S03();
		obj.fizbuzz(30);
	}

	public int fizbuzz(int n) {
		
		
		
			for (int i = 1; i <= n; i++) {
				if (n % 3 == 0) {
					System.out.println("Fizz");
				} else if (n % 5 == 0) {
					System.out.println("Buzz");
				} else if (n % 15 == 0) {
					System.out.println("FizzBuzz");
				}
			}
		
		
		
		return n;
		
	}
}
