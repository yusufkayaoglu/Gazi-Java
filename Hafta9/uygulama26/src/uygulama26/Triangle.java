package uygulama26;

public class Triangle extends Shape {
 
    public Triangle(String name) {
        super(name);
    }

    
    @Override
    public void draw() {
        System.out.println("Üçgen çizimi yapýlýyor...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}