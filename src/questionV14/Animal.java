package questionV14;

public class Animal {

	String type = "Canine";
	int maxSpeed = 60;

	Animal() {
		// TODO Auto-generated constructor stub
	}

	Animal(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {

		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Felina", 60, "Short");

		System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
		System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);

	}

}

class WildAnimal extends Animal {
	String bounds;

	WildAnimal(String bounds) {
		super();
		this.bounds = bounds;// line n1
	}

	WildAnimal(String type, int maxSpeed, String bounds) {
		super(type, maxSpeed);
		this.bounds = bounds;

	}

}