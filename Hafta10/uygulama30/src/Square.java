public class Square implements Shape {
   // area perimeter

    @Override
    public double getArea(int kenar) {
        return kenar*kenar;
    }

    @Override
    public double getPerimeter(int kenar) {
        return (kenar+kenar+kenar+kenar);
    }
}
