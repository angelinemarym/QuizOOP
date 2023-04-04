package session06;

class Person2 {
	int mantul = 1;
	public Person2(){
		System.out.println("(1) Performs Person Tasks");
	}
}

class Employee extends Person2{
	int mantul = 0;
	public Employee (String s) {
		System.out.println(s);
	}
	
	public Employee() {
		this("(2) Invoke Employee's Overload Constructor");
		System.out.println("(3) Performs Employee Tasks");
	}
}

public class TestChaining extends Employee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestChaining();
	}

	public TestChaining() {
		System.out.println("(4) Performs TestChaining Task");
	}

}
