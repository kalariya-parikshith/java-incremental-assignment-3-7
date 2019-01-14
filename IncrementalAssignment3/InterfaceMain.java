interface College {
	void collegeName();
	void collegeAddress();
}

interface Student {
	void studentName();
	void rollNo();
}

interface Course {
	void courseName();
	void branch();
}

interface CollegeStudentDetails extends College,Student,Course {
	void fees();
}

class ConcreteClass {
	void concreteClassMethod(){
		System.out.println("ConcreteClass method");
	}
}

class ImplementClass extends ConcreteClass implements CollegeStudentDetails {
	public void collegeName(){
		System.out.println("SNIST");
	}

	public void collegeAddress(){
		System.out.println("Ghatkesar, Hyderabad");
	}

	public void studentName(){
		System.out.println("Parikshith");
	}

	public void rollNo(){
		System.out.println("15311A0504");
	}

	public void courseName(){
		System.out.println("B. Tech");
	}

	public void branch(){
		System.out.println("CSE");
	}

	public void fees(){
		System.out.println("2 Lakhs");
	}

	void collegeInterfaceMethod(College college){
		college.collegeName();
		college.collegeAddress();
	}

	void studentInterfaceMethod(Student student){
		student.studentName();
		student.rollNo();
	}

	void courseInterfaceMethod(Course course){
		course.courseName();
		course.branch();
	}

	void allInterfaceMethod(CollegeStudentDetails allInterface){
		allInterface.fees();
	}
}

class InterfaceMain{
	public static void main(String[] args) {
		ImplementClass implementClass = new ImplementClass();
		implementClass.collegeInterfaceMethod(implementClass);
		implementClass.studentInterfaceMethod(implementClass);
		implementClass.courseInterfaceMethod(implementClass);
		implementClass.allInterfaceMethod(implementClass);
	}
}