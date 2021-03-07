package questionV18;

public class S34 {
	
	static double area;
	int b=2, h=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double p, b, h;  //line n1
		if(area==0) {
			b=3;
			h=4;
			p=0.5;
			area=p*b*h; //line n2
		}
		System.out.println(area);
	}

}
