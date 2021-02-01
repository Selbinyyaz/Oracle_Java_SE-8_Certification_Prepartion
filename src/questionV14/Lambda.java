package questionV14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		List<Integer> llist = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 7));

		// normal way
		for (int i = 0; i < llist.size(); i++) {
			if (llist.get(i) % 2 != 0) {// will remove 3, 5,7
				llist.remove(i);
				

			}
		}
		 System.out.println(llist);

		// lambda way
		llist.removeIf(x -> x % 2 != 0); // will remove 3, 5, 7
		System.out.println(llist);// will print 2, 4

	}

}
