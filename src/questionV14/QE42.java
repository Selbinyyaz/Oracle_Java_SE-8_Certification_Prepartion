package questionV14;

public class QE42 {

	int ns;
	static int s;

	QE42(int ns) {
		if (s < ns) {

			s = ns;

			this.ns = ns;
		}
	}

	void doPrint() {
		
		System.out.println("ns = "+ns+" s = "+s);

	}
}
