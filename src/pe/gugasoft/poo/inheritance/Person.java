package pe.gugasoft.poo.inheritance;

public abstract class Person {

	private String firstName;
	private String lastName;
	private String dni;
	
	public Person() {
		
	}

	public Person(String firstName, String lastName, String dni) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dni = dni;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}