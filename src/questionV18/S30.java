package questionV18;

import java.util.ArrayList;
import java.util.List;

public class S30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();

		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		System.out.println(names);//[Robb, Bran, Rick, Bran]
		
		if(names.remove("Bran")) {// this will remove Bran
		//	names.remove("Jon");
			//System.out.println(names);
		}
		System.out.println(names);//[Robb, Rick, Bran]

	}

}
