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

}
class WildAnimal extends Animal{
	String bounds;
	
	WildAnimal(String bounds){
		//line n1
	}
	 WildAnimal(String type, int maxSpeed, String bounds) {
		// TODO Auto-generated constructor stub
	}
}