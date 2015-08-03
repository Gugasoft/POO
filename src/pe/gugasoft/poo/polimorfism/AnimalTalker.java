package pe.gugasoft.poo.polimorfism;

public class AnimalTalker {

	private Animal animal;
	
	public AnimalTalker(Animal animal) {
		this.animal = animal;
	}
	
	public void makeAnimalTalk() {
		animal.talk();
	}
	
}