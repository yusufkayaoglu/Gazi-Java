package uygulama27;

public class Car extends Vehicle {
	
    private String model;

   
    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    public void start() {
        System.out.println("Car çalýþtýrýlýyor.");
    }

    public String getModel() {
        return model;
    }
}
