package pe.gugasoft.poo.polimorfism;

public class Polimorfism {

	public static void main(String[] args) {
		AnimalTalker talker = new AnimalTalker(new Dog());
		talker.makeAnimalTalk();
		
		talker = new AnimalTalker(new Cat());
		talker.makeAnimalTalk();
		
		talker = new AnimalTalker(new Wolf());
		talker.makeAnimalTalk();
	}

}
