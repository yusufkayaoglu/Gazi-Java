package uygulama26;

public class Square extends Shape {
    
    public Square(String name) {
        super(name);
    }

    
    @Override
    public void draw() {
        System.out.println("Kare çizimi yapýlýyor.");
      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
