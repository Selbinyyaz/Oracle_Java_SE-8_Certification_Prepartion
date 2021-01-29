package questionV14;

public class QE31 {

	int x;

	QE31() {
		this(10);
	}

	QE31(int x) {
		this.x = x;

	}

}

class Car extends QE31 {
	int y;

	public Car() {
		super();
		// this(20); \\line n2 cannot be second line

	}

	Car(int y) {
		this.y = y;
	}

	public String toString() {
		return super.x + " : " + this.y;
	}

}