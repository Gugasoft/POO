package pe.gugasoft.poo.overriding;

public class Overriding {
	
	public static void main(String[] args) {
		Spanish spanish = new Spanish();
		English english = new English();
		
		spanish.language();
		spanish.features();
		
		System.out.println();
		
		english.language();
		english.features();
	}
}
