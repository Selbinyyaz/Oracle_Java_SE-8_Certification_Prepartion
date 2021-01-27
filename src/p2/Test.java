package p2;

import p1.Acc;

public class Test extends Acc{

	public static void main(String[] args) {
		
		Acc obj= new Test();
	//	obj.p=10; -->default not visible
		//obj.r=12; protected not visible 
		obj.s=10;//---> only public accessible
		
//		Test obj1=new Test();--> if test object created
//		obj1.r=11;
//		
		
	}

}
