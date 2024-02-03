package uygulama26;

public class Circle extends Shape {
    
    public Circle(String name) {
        super(name);
    }

    
    @Override
    public void draw() {
    	int radius = 5; 
        int centerX = 5; 
        int centerY = 5; 

        for (int i = 0; i < 2 * radius + 1; i++) {
            for (int j = 0; j < 2 * radius + 1; j++) {
                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
