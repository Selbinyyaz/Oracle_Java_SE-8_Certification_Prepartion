package questionV14_111_130;

public class Q120 {

	static double area;
	int b = 2, h = 3;// intance variable

	public static void main(String[] args) {

		double p, b, h;// line n1

		if (area == 0) {
			b = 3;
			h = 4;
			p = 0.5;
			area = p * b * h; // line n2

		}
		System.out.println("Area is " + area);
	}

}
