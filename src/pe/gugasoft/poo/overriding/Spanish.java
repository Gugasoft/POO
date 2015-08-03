package pe.gugasoft.poo.overriding;

public class Spanish extends Person {

	@Override
	public void language() {
		System.out.println("Español");
	}
	
	@Override
	public void features() {
		System.out.println("Cabello castaño, ojos café y estatura mediana");
	}

}
