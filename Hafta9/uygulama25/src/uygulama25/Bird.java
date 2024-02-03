package uygulama25;

public class Bird extends Animal {
   
    private String featherColor;

   
    public Bird(String species, String featherColor) {
        super(species);
        this.featherColor = featherColor;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Kuþ ötüyor.");
    }

    
    public String getFeatherColor() {
        return featherColor;
    }
}
