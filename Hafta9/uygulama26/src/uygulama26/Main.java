package uygulama26;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("�ember");
        Square square = new Square("Kare");
        Triangle triangle = new Triangle("��gen");

        Shape[] shapes = {circle, square, triangle};
        Drawing drawing = new Drawing(shapes);

        drawing.drawAllShapes();
    }
}
