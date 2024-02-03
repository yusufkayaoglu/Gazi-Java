package uygulama26;

public class Drawing {
	 Shape[] shapes;

	    Drawing(Shape[] shapes) {
	        this.shapes = shapes;
	    }

	    void drawAllShapes() {
	        for (int i = 0; i < shapes.length; i++) {
	            Shape shape = shapes[i];
	            System.out.println("Þekil Adý: " + shape.name);
	            shape.draw();
	            System.out.println();
	        }
	    }

}
