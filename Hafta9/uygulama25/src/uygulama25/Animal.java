package uygulama25;

public class Animal {
    
    private String species;

   
    public Animal(String species) {
        this.species = species;
    }

    
    public void makeSound() {
        System.out.println("Hayvan  ses ��kar�yor.");
    }

    
    public String getSpecies() {
        return species;
    }
}