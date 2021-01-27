package questionV14;

public class QE24 {

	public static void main(String[] args) {
		 
		String [] strs= new String[2];//--> null array that is not assigned
		
	//	System.out.println(strs[0]);
		
		int idx=0;
		
	
		
		for(String s:strs) {
			strs[idx].concat("element "+idx);// we can not concat if array is null
			idx++;
			
		}
		for ( idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
		
//		String a= "Hello";
//		String b="bye";
//		
//		System.out.println(a.concat(b));
	}

}
