package questionV14_64;

abstract class QE101 {

	protected void revolve() {// protected, public 

	}

	abstract void rotate();// default, protected, public 

}
//class Earth extends QE101{

//	private void revolve() {//make the method public, protected, -->
//public, protected, default, private  / we can't use weak
//		
//	}
//	private void rotate() {//make the method public, protected, default
//		
//	}
//}
class Earth extends QE101{
	 protected void revolve() {// can be public 
		
	}
	
	protected void rotate() {
		
	}
	
}