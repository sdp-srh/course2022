package automotive;

public class MyCarsExample {

	public static void main(String[] args) {
		// create a car object
		Car theTesla = new Car();
		// set values for the different attributes
		theTesla.setBrand("Tesla");
		theTesla.setModel("Model 3");
		theTesla.setDoors(4);
		theTesla.setColor("Blue");
		theTesla.setSeats(4);
		theTesla.setSpeed(0);
		// create an object of motor
		Motor electricMotor = new Motor("Electric", "electricity", 200);
		// set the motor object for the car
		theTesla.setMotor(electricMotor);
		// call the print brand method
		theTesla.printBrand();
		// display the speed and accelerate then
		System.out.println("Start Speed is " + theTesla.speed);
		theTesla.accelerate(45);
		System.out.println("New Speed is " + theTesla.getSpeed());
		
		// create a second car object with the constructor with different parameters
		Car theBeetle = new Car("VW", "Beetle", 2, 4, "Red", 800, new Motor("Gas", "Benzin", 100));
		System.out.println(theBeetle.getModel()+" needs "+theBeetle.getMotor().getFuel());
	}	


}
