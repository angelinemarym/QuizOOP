package session06;

class PersonOne {
	// Attribute
	int PersonAttr = 5;
	
	// COnstructor
	PersonOne () {
		System.out.println("Person Class Constructor");
	}
	
	void message() {
		System.out.println("This Message from PersonOne class");
	}
}

// Child Class
class StudentOne extends PersonOne {
	int PersonAttr = 6;
	
	StudentOne(){
		super();
		System.out.println("Student Class Constructor: " + super.PersonAttr + " this / var: " + " " + this.PersonAttr);
	}
	
	void message() {
		System.out.println("This Message from Student class");
	}
	
	void display() {
		this.message();
		message();
		super.message();
	}
}
public class TestSuperConstructorVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOne s = new StudentOne();
		s.display();
	}

}
