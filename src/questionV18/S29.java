package questionV18;

import java.util.ArrayList;

public class S29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>points= new ArrayList<>();
		
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(1);
		points.remove(null);
		System.out.println(points);//[1, 3, 4]

		

	}

}
