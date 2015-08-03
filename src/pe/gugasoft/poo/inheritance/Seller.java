package pe.gugasoft.poo.inheritance;

public class Seller extends Person {

	private double sellRatioPerDay;
	
	public Seller() {
		
	}

	public Seller(String firstName, String lastName, String dni, double sellRatioPerDay) {
		super(firstName, lastName, dni);
		this.sellRatioPerDay = sellRatioPerDay;
	}

	public double getSellRatioPerDay() {
		return sellRatioPerDay;
	}

	public void setSellRatioPerDay(double sellRatioPerDay) {
		this.sellRatioPerDay = sellRatioPerDay;
	}
	
}