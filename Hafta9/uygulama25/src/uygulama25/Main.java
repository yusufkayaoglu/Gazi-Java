package uygulama25;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Hayvan");
		animal.makeSound();
		Bird bird= new Bird("Güvercin", "Sarý");
		bird.makeSound();
		System.out.println("Kuþ türü: " + bird.getSpecies());
        System.out.println("Kuþ tüy rengi: " + bird.getFeatherColor());

		
		

	}

}
