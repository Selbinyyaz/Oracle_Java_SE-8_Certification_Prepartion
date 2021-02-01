package questionV14;

import java.util.ArrayList;
import java.util.List;

public class QE41 {

	public static void main(String[] args) {
		// what is the result?
		List<String>names=new ArrayList<>();
		
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if(names.remove("Bran")) {
			//names.remove("Rick"); if you
		}
		System.out.println(names);

	}

}
