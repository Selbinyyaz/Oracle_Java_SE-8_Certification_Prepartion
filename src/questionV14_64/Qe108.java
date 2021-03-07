package questionV14_64;

public class Qe108 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();

		employee.salary = 10;
		manager.salary = 12;
		director.salary = 13;

	}
}

class Employee {
	public int salary;
}

class Manager extends Employee {
	public int budget;
}

class Director extends Manager {
	public int stockOptions;
}
