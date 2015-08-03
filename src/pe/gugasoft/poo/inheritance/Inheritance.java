package pe.gugasoft.poo.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Administrator administrator = new Administrator();

		administrator.setFirstName("Juan");
		administrator.setLastName("Vélez");
		administrator.setDni("94839387");
		administrator.setMasterKey("A7xj$589dh3$");
		
		System.out.println("[+] Datos del administrador\n");
		System.out.printf("Nombre completo: %s %s %n", administrator.getFirstName(),
				administrator.getLastName());
		System.out.printf("DNI: %s %n", administrator.getDni());
		System.out.printf("Llave maestra: %s", administrator.getMasterKey());
	}

}
