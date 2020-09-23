package questionsV13;

public class S02 {

	public static void main(String[] args) {
		// byte-->short-->int-->long-->float-->double
		
		int iVar=100;
		
		float fVar=100.100f;
		
		double dVar= 123.3;
		
	//	iVar = fVar; cannot convert from float to integer
	//	iVar=100.100f;--> similar to iVar = fVar;
		
		fVar = iVar;
		
		dVar = fVar;
	//	dVar= 100.100f;
		
		fVar = (float) dVar;// we need convert 
		
		dVar=iVar;
		
		iVar=(int) dVar;// iVar=100.100f;--> int iVar=100.100f cannot be;
		
		
		int a=(int) 2.5;// cannot use float, double
		
		float b=2;// but can use integer
		
		
	}

}
