package questionV14_64;

class Student {
	String name;

	public Student(String name) {
		this.name = name;// 

	}
}

public class QE103 {

	public static void main(String[] args) {
		 
		Student [] students= new Student[3];
		
		students[1]=new Student("Richard");
		students[2]=new Student("Donald");
		
//		students[0]=new Student("Richard");
//		students[1]=new Student("Donald");
		//answer is Richard, Doland, NullPointerException
		
		
		for(Student s:students) {
			System.out.println(" "+s.name);//instance variable
			//answer is NullPointerException
		}
	}
}
