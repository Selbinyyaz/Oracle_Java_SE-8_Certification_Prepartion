package questionsV13;

//public class S83 {
//
//}
interface Downloadable {

	public void dowload();
}

interface Readable extends Downloadable {

	public void readbook();
}
abstract class Book implements Readable{// if no abstract class we have to implement all method
	 
	public void readbook() {
		
	}
}
class EBook extends Book{

	@Override
	public void dowload() {
		// TODO Auto-generated method stub
		
	}
	
}