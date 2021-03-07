package questionV18;

public class S02 {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		int k =(j+=i)/5;//j=j+i=>30:5=6
		
		System.out.println(i+":"+j+":"+k);
		
		//i=10; j=30; k=6
	}

}
