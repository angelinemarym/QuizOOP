package session06;

import java.util.Scanner;

class Person {
	String name;
	int bornDate;
	Person(String name, int bornDate) {
		this.name = name;
		this.bornDate = bornDate;
	}
	
	public void sleep() {
		System.out.println("Person Class Sleep");
	}
}

class Mahasiswa extends Person{
	String studentID;
	int point;

	public Mahasiswa(String name, int bornDate, String studentID, int point) {
		super(name, bornDate);
		this.studentID = studentID;
		this.point = point;
	}
	
	public void helpingDosen() {
		point += 10;
		System.out.println("Point after Helping Dosen : " + point);
	}
}

class Dosen extends Person{
	String codeDosen;
	int point;
	public Dosen(String name, int bornDate, String codeDosen, int point) {
		super(name, bornDate);
		this.codeDosen = codeDosen;
		this.point = point;
	}
	
	public void selfDev() {
		System.out.println("SelfDev Method");
	}
	
	public void teach() {
		System.out.println("Teach Method");
	}
	
	public void p2m() {
		System.out.println("p2m method");
	}
	
	public void research() {
		System.out.println("Research method");
	}
	
	public void otherWorks() {
		System.out.println("Other works method");
	}
}

public class Quiz {

	public static void main(String[] args) {
		Person p = new Person("Budi", 5);
		Mahasiswa m = new Mahasiswa("Ani", 3, "2540126834", 100);
		Dosen d = new Dosen("Yudi", 10, "D090", 150);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Select class:");
		System.out.println("1. Person");
		System.out.println("2. Mahasiswa");
		System.out.println("3. Dosen");
		System.out.print(">> ");
		int chooseClass = sc.nextInt();
		
		switch(chooseClass) {
		case 1:
			System.out.println("Name : " + p.name);
			System.out.println("Born Date : " + p.bornDate);
			p.sleep();
			break;
		case 2:
			System.out.println("Name : " + m.name);
			System.out.println("Born Date : " + m.bornDate);
			System.out.println("Student ID: "+ m.studentID);
			System.out.println("Point : " + m.point);
			m.helpingDosen();
			break;
		case 3:
			System.out.println("Name : " + d.name);
			System.out.println("Born Date : " + d.bornDate);
			System.out.println("Dosen Code : " + d.codeDosen);
			System.out.println("Point : " + d.point);
			d.selfDev();
			d.teach();
			d.p2m();
			d.research();
			d.otherWorks();
			break;
		}
		
	}

}
