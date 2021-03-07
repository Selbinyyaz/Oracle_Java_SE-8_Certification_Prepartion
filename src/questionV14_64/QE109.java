package questionV14_64;

public class QE109 {

	private char var;

	public static void main(String[] args) {

		char var1 = 'a';
		char var2 = var1;// a
		var2 = 'e';// assigned e

		QE109 obj1 = new QE109();
		QE109 obj2 = obj1;// new QE109();

		obj1.var = 'o';
		obj2.var = 'i';
		
		System.out.print(var1+", "+var2);
		System.out.print(obj1.var+", "+obj2.var);

	}

}
