package questionV18;

public class S21 {
	public static void main(String[] args) {
	//	Bus v = new Bus();// Vehicle Bus
		
		Vehicle1 v1=new Bus();
	}
}

class Vehicle1 {
	Vehicle1() {
		System.out.println("Vehicle");
	}
}

class Bus extends Vehicle1 {
	Bus() {
		System.out.println("Bus");
	}
}
