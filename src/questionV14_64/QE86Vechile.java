package questionV14_64;

public class QE86Vechile {
	
	int x;
	
	 QE86Vechile() {
		 this(10);
		
	}
	 
	 QE86Vechile(int x) {
			this.x=x;
		}
	 

}

class Car extends QE86Vechile{
	
	int y;
	
	Car(){
		super(10);//line n2 will call vechile contructor
		
	}
	Car(int y){
		super(y);
		this.y=y;
	}
	public String toString(){
		return super.x+ ":"+this.y; //vechile + Car constructor
		
	}
	
	public static void main(String[] args) {
		Car y = new Car(20);
		System.out.println(y);
	}
}
