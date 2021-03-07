package questionV18;

public class S20 {
	
	int a1;
	
	public static int doProduct(int a) {
		return a=a*a;// nothing return it 
	}
	public static void doString(String s) {
		s.concat(" "+s);// didn't assigned it
	}
	public static void main(String[] args) {
		S20 item= new S20();
		item.a1=11;
		String sb="Hello";
		Integer i=10;
		
	//System.out.println(	doProduct(i)); this will be 100
		doString(sb);// this will not do anything
		doProduct(item.a1);// this will not do anything
		System.out.println(i+" "+sb+" "+item.a1);
	}

}

