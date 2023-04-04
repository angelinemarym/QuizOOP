package session06;

// We will create two classes:
// 1. Bicycle Class
// 2. MountainBike Class

// Bicycle will have two attributes: gear and speed
// Methods: applyBrake(), speedUp(), toString()
class Bicycle {
	public int gear;
	public int speed;
	
	// Constructor
	public Bicycle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return ("No of gears is " + gear + "\n" + "Speed of bicycle is " + speed);
	}
}

// Mountain Bike will have three attributes: gear, speed, and seatHeight
// Methods: seatHeight()
class MountainBike extends Bicycle {
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	@Override // optional
	public String toString() {
		return (super.toString() + "\nSeat height is " + seatHeight);
	}
	
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(2, 60, 25);
		System.out.println(mb.toString());
		mb.speedUp(1);
		System.out.println("After speed up:");
		System.out.println(mb.toString());
	}

}
