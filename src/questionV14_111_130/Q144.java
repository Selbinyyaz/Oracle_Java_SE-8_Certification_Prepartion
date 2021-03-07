package questionV14_111_130;

import java.util.ArrayList;
import java.util.List;

class Patient {
	String name;

	public Patient(String name) {
		this.name = name;
	}
}

public class Q144 {

	public static void main(String[] args) {

		List ps = new ArrayList();
		Patient p1 = new Patient("Mike");// index 0
		ps.add(p1);
//		Patient p2=new Patient("John");index 1
//		ps.add(p2);

		int f = ps.indexOf(p1);// Returns the index of the first occurrence of the specified elemen * in this
								// list
		
	//	int f = ps.indexOf(Patient("Mike"));
		System.out.println(f);

		if (f >= 0) {
			System.out.println("Mike found");
		}

	}
}