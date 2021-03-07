package questionV18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"Hi", "How", "Are", "you"};
		
		List<String>arrlist= new ArrayList<>(Arrays.asList(arr));
		
		if(arrlist.removeIf(s-> {System.out.println(s);return s.length()<=2;})) {
			System.out.println(" removed");
		}

	}

}
