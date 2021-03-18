import java.text.DecimalFormat;

public class Student extends Person {
	private double firstGrade = 0.0;
	private double secondGrade = 0.0;
	private double thirdGrade = 0.0;
	private double averageGrade = 0.0;

	public Student(String firstName, String lastName, int age, char gender) {
		super(firstName, lastName, age, gender);
	}

	public Student(String firstName, String lastName, int age, char gender, double firstGrade, double secondGrade,
			double thirdGrade, double averageGrade) {
		super(firstName, lastName, age, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}

	public double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public double getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	
	public double calculateAverageGrade() {
		double avr = (firstGrade + secondGrade + thirdGrade) / 3;
		setAverageGrade(avr);
		return avr;
	}
	
	public double calculateAverageGrade(double firstGrade, double secondGrade, double thirdGrade) {
		double avr = (firstGrade + secondGrade + thirdGrade) / 3;
		setAverageGrade(avr);
		return avr;
	}
	
	public boolean hasClearedTheCourse() {
		if (getAverageGrade() < 6) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		calculateAverageGrade(getFirstGrade(), getSecondGrade(), getThirdGrade());
		DecimalFormat df = new DecimalFormat("#.0");
		
		if (hasClearedTheCourse()) {
			return "Student: " + getFirstName() + " " + getLastName() + "\n" + "Grades: " + this.firstGrade + " , "
				+ this.secondGrade + " , " + this.thirdGrade + "\nFinal Grade: " + df.format(getAverageGrade())
				+ "\nThe student has cleared the course\n ---------------------";
		}
		
		return "Student: " + getFirstName() + " " + getLastName() + "\n" + "Grades: " + this.firstGrade + " , "
		+ this.secondGrade + " , " + this.thirdGrade + "\nFinal Grade: " + df.format(getAverageGrade())
		+ "\nThe student has not cleared the course\n ---------------------";			
	}
}