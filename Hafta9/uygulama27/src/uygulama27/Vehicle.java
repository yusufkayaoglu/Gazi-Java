package uygulama27;

public class Vehicle {
	 
    private String brand;

    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void start() {
        System.out.println("Vehicle çalýþtýrýlýyor.");
    }
}
