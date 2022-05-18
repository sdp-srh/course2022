package automotive;

public class Motor {
	String type;
	String fuel;
	int power;
	
	public Motor() {
		super();
		this.type = "";
		this.fuel = "";
		this.power = 0;
	}
	
	
	public Motor(String type, String fuel, int power) {
		super();
		this.type = type;
		this.fuel = fuel;
		this.power = power;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPowerInHP() {
		int hp = (int) Math.round(1.35962 * this.power);
		return hp;
	}
}
