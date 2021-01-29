package questionV14;

public interface Downloadable {

	public void download();
}

interface Readable extends Downloadable{ // both of them interface ==> extends keyword
	public void readBook();      //line n1
	
}

abstract class Book implements Readable{ // abstract is class ==> class+ interface=> implements
	
	public void readBook() {        //line n2
		System.out.println("Read Book");
	}
	
}

 class EBook extends Book{             //class and class ==>extends
	 
	public void readBook() {// line n3         should add unimplemented method from interface (downloadable)class 
		System.out.println("Read E-book");// or ebook should be abstarct class
	}

	


}

 class Download{
	public static void main(String[] args) {
		Book book1 = new EBook();
		
	}
}