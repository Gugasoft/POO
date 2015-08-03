package pe.gugasoft.poo.inheritance;

public class Administrator extends Person {

	private String masterKey;
	
	public Administrator() {
		
	}

	public Administrator(String firstName, String lastName, String dni, String masterKey) {
		super(firstName, lastName, dni);
		this.masterKey = masterKey;
	}


	public String getMasterKey() {
		return masterKey;
	}

	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}
	
}
