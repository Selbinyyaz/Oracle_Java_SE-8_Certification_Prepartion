package p2;

import p1.Acc;

public class Test extends Acc {

	public static void main(String[] args) {
		
		//Acc-->parent class
		//Test-->child class

		Acc obj = new Test();// if I created parent class object, protected is not visible

		// obj.p=10; -->default not visible
		// obj.r=12; protected not visible
		obj.s = 10;// ---> only public accessible

//		Test obj1=new Test();--> if I created child class object, protected is  visible
//		obj1.r=11;
//		

	}

}
