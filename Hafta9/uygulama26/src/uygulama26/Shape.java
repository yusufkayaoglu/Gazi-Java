package uygulama26;

public class Shape {
	String name;

    
    public Shape(String name) {
        this.name = name;
    }

   
    public void draw() {
        System.out.println("Çizim yapýlýyor.");
    }

    public String getName() {
        return name;
    }
}
