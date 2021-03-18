import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Classroom classroom = new Classroom("Software Tester", "Spring 2021", students);
		Student student1 = new Student("Rafael", "Ln", 20, 'M', 5.0, 4.0, 3.0,0.0);
		Student student2 = new Student("Simone", "Ln", 18, 'M', 5.0, 6.0, 3.0,0.0);
		Student student3 = new Student("Love", "Ln", 25, 'M', 7.0, 7.0, 7.0,0.0);
		Student student4 = new Student("Emelie", "Ln", 30, 'F', 5.0, 9.0, 8.0,0.0);
		
		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.addANewStudent(student4);
		
		classroom.printFullRelatory();
		
		classroom.removeAStudent("Love");
		classroom.removeAStudent("Rafael");
	}
}