package ac.za.cput;

public class SignUp {
	private String name;
	private String surname;
	private long studentNumber;
	private String course;
	private int courseCode;
	private String classGroup;
	
	public SignUp(String name, String surname, long studentNumber, String course, int courseCode, String classGroup) {
		this.name = name;
		this.surname = surname;
		this.studentNumber = studentNumber;
		this.course = course;
		this.courseCode = courseCode;
		this.classGroup = classGroup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public String getClassGroup() {
		return classGroup;
	}
	public void setClassGroup(String classGroup) {
		this.classGroup = classGroup;
	}
	@Override
	public String toString() {
		return "SignUp [name=" + name + ", surname=" + surname + ", studentNumber=" + studentNumber + ", course="
				+ course + ", courseCode=" + courseCode + ", classGroup=" + classGroup + "]";
	}

}
