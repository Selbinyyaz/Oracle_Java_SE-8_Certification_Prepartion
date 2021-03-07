package questionV18;

public class S11 {

	public static void main(String[] args) {
		//What is the result
		
		String[] strs= {"A", "B"};
		
		int idx=0;
		
		for(String s:strs) {
			strs[idx].concat("Element"+idx);
			idx++;
			
		}
		for ( idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);// answer is A B
		}

	}

}
