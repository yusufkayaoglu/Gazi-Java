// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        System.out.println("Darienin alanı : " + circle.getArea(10));
        System.out.println("Dairenin çevresi : " + circle.getPerimeter(10));
        System.out.println("Karenin alanı : " + square.getArea(10));
        System.out.println("Karenin çevresi : " + square.getPerimeter(10));

    }
}