package pe.gugasoft.poo.overload;

public class Overload {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		// primer método
		factory.createCar("Rojo", "Lamborgini");
		Car car = factory.getCar();
		
		System.out.println("[+] Info del auto creado...\n");
		System.out.printf("Color: %s%nFabricante: %s", car.getColor(), car.getBrand());
		
		// segundo método, sobrecargado
		factory.createCar("Plateado", "Audi", (byte) 2, (byte) 300);
		car = factory.getCar();
		
		System.out.println("\n\n[+] Info del auto creado...\n");
		System.out.printf("Color: %s%nFabricante: %s", car.getColor(), car.getBrand());
	}

}
