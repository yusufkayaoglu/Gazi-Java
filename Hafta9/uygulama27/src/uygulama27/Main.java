package uygulama27;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Vehicle("Genel Ara�"),new Car("BMW", "i8"), new Car("Ford", "Mustang")};
        bilgileri_g�ster(vehicles);
    }

    private static void bilgileri_g�ster(Vehicle[] vehicles) {
    	for (int i = 0; i < vehicles.length; i++) {
    	    Vehicle vehicle = vehicles[i];
    	    System.out.println("Marka: " + vehicle.getBrand());
    	    if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Model: " + car.getModel());
            }
    	    vehicle.start();
    	    System.out.println();
    	}
    }
}