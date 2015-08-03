package pe.gugasoft.poo.overload;

public class Car {

	private String brand;
	private String color;
	private byte doors;
	private byte hp;
	
	public Car() {
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getDoors() {
		return doors;
	}

	public void setDoors(byte doors) {
		this.doors = doors;
	}

	public byte getHp() {
		return hp;
	}

	public void setHp(byte hp) {
		this.hp = hp;
	}
	
}