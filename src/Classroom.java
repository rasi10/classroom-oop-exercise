import java.util.ArrayList;

public class Classroom {
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {		
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void addANewStudent(Student student) {		
		students.add(student);		
	}
		
	public void removeAStudent(String firstName) {	
		int counter = 0;
		boolean studentExist = false;
		int indexToBeRemoved = -1;
		
		while ((counter < students.size()) && (studentExist == false)) {
			if (students.get(counter).getFirstName().equals(firstName)) {
				studentExist = true;
				indexToBeRemoved = counter;
			}
			counter ++;
		}
		
		if(studentExist) {
			students.remove(indexToBeRemoved);
			System.out.println("Student " + firstName + " Successfully removed!");
		} else {
			System.out.println("The student does not exist!");
		}		
	}
	

	public void printFullRelatory() {	
		System.out.println("Classroom: "+ classroomName);
		System.out.println("Term: " + classroomTerm);
		System.out.println("---------------------------");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
	}
	

}
