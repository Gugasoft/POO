package pe.gugasoft.poo.inheritance;

public class Cashier extends Person {

	private boolean partTime;
	
	public Cashier() {
		
	}

	public Cashier(String firstName, String lastName, String dni, boolean partTime) {
		super(firstName, lastName, dni);
		this.partTime = partTime;
	}

	public boolean isPartTime() {
		return partTime;
	}

	public void setPartTime(boolean partTime) {
		this.partTime = partTime;
	}
	
}