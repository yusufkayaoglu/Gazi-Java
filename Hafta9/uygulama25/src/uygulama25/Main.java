package uygulama25;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Hayvan");
		animal.makeSound();
		Bird bird= new Bird("G�vercin", "Sar�");
		bird.makeSound();
		System.out.println("Ku� t�r�: " + bird.getSpecies());
        System.out.println("Ku� t�y rengi: " + bird.getFeatherColor());

		
		

	}

}
