package questionV18;

 interface Exportable {

	 void export();
	 
}
class Tool implements Exportable{
	public void export() {// All methods in an interface default to public 
		//line n1
	}
}
class ReportTool extends Tool implements Exportable{
	
	public void export() {//line n2
		
	}
	public static void main(String[] args) {
		Tool aTool= new ReportTool();
	}
}