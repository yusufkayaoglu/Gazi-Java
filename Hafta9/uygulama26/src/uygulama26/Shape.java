package uygulama26;

public class Shape {
	String name;

    
    public Shape(String name) {
        this.name = name;
    }

   
    public void draw() {
        System.out.println("�izim yap�l�yor.");
    }

    public String getName() {
        return name;
    }
}
