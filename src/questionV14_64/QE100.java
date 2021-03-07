package questionV14_64;

//public class QE100 {}

class CD {
	int r;

	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD {

	int c;

	DVD(int r, int c) {
		super(r);
		this.c = c;

	}

	public static void main(String[] args) {
		// Which code fragment should you use at line n1 to instantiate the dvd object
		// successfully?

		DVD dvd = new DVD(10, 20);

	}

}
