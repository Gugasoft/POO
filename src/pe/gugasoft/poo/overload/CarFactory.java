package pe.gugasoft.poo.overload;


public class CarFactory {
	
	private Car car;
	
	public CarFactory() {
		car = new Car();
	}
	
	public CarFactory(String color, String brand) {
		this();
		car.setColor(color);
		car.setBrand(color);
	}
	
	public CarFactory(String color, String brand, byte doors) {
		this();
		car.setColor(color);
		car.setBrand(brand);
		car.setDoors(doors);
	}
	
	public CarFactory(String color, String brand, byte doors, byte hp) {
		this();
		car.setColor(color);
		car.setBrand(brand);
		car.setDoors(doors);
		car.setHp(hp);
	}
	
	public Car getCar() {
		return car;
	}

	public void createCar(String color, String brand) {
		car.setColor(color);
		car.setBrand(brand);
	}
	
	public void createCar(String color, String brand, byte doors) {
		car.setColor(color);
		car.setBrand(brand);
		car.setDoors(doors);
	}
	
	public void createCar(String color, String brand, byte doors, byte hp) {
		car.setColor(color);
		car.setBrand(brand);
		car.setDoors(doors);
		car.setHp(hp);
	}
	
}