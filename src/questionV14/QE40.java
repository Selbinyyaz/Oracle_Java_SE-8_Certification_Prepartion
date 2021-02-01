package questionV14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QE40 {

	public static void main(String[] args) {
		
		String [] arr= {"Hi", "How", "Are", "You"};
		
		List<String> arrList= new ArrayList<>(Arrays.asList(arr));
		
		if(arrList.removeIf(
		    s->{    // if curly braces use that it should use return  
		    	//s degeri lambda  
			
		    System.out.println(s);// s i yazdir
			
			return s.length()<=2;
			
			})) 
		
		{
			
			System.out.println("removed " );
		}

	}

}
