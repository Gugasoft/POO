package pe.gugasoft.poo.overriding;

public class English extends Person {

	@Override
	public void language() {
		System.out.println("Inglés");
	}

	@Override
	public void features() {
		System.out.println("Cabello rubio, ojos azules y estatura alta");
	}
	
}
