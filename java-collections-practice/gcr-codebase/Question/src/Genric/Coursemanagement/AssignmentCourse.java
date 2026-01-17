package Genric.Coursemanagement;

public class AssignmentCourse extends CourseType{

	public AssignmentCourse(String name, int duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void details() {
		System.out.println("\n-----Assignment Course details-----");
		System.out.println("Course Name : "+this.getName());
		System.out.println("Duration    : "+this.getDouration());
		System.out.println("Speciality  : Important For Knowledge");
	}

}
