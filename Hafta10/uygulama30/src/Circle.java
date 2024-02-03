public class Circle implements Shape{
    @Override
    public double getArea(int yaricap) {
       return ((Math.PI)*yaricap*yaricap);
    }
    @Override
    public double getPerimeter(int yaricap) {
        return (2*(Math.PI)*yaricap);
    }
}
