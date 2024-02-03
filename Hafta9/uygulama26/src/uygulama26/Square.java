package uygulama26;

public class Square extends Shape {
    
    public Square(String name) {
        super(name);
    }

    
    @Override
    public void draw() {
        System.out.println("Kare �izimi yap�l�yor.");
      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
