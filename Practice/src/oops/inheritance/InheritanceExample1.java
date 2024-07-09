package oops.inheritance;

class Bicycle{
	private int gear;
	private int speed;
	
	public Bicycle(int gear, int speed) {
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
		return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
	}
}

class MountainBike extends Bicycle{
	
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	 // the MountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()  + "\nseat height is "
                + seatHeight;
	}
	
}

public class InheritanceExample1 {
    public static void main(String[] args) {
    	MountainBike mb = new MountainBike(3, 100, 25);
    	System.out.println(mb.toString());
    }
}
