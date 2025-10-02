package MentorLesson5HomeProject;

public class CarSystemMain {
    public static void main(String[] args) {

        Manufacturer mn1 = new Manufacturer("Toyota", 1950, "Japan");
        Manufacturer mn2 = new Manufacturer("BMW", 1895, "Germany");

        Car[] cars = new Car[3];
        Car[] dieselCars = new Car[3];
        Car[] germanCars = new Car[3];
        double max = 0;
        Car[] expensiveCar = new Car[1];
        cars[0] = new Car("540", mn2, 2020, 2.0, "Benzin", 74.000);
        cars[1] = new Car("yaris", mn1, 2025, 0.0, "Electric", 15.000);
        cars[2] = new Car("X5", mn2, 2024, 5.5, "Diesel", 100.000);

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getFuelType().equalsIgnoreCase("Diesel")) {
                dieselCars[i] = cars[i];
            }
            if (cars[i].getManufacturer().getCountry().equalsIgnoreCase("Germany")) {
                germanCars[i] = cars[i];
            }
            if(cars[i].getPrice()>max){
                max = cars[i].getPrice();
                expensiveCar[0] = cars[i];
            }

        }

        System.out.println("=== Manufacturer Info ===");
        System.out.println(mn1);
        System.out.println(mn2);
        System.out.println("=== Car Catalog ===");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("=== DIESEL CARS ===");
        for (Car dieselcar : dieselCars) {
            if (dieselcar != null) {
                System.out.println(dieselcar);
            }
        }
        System.out.println("=== GERMAN CARS ===");
        for (Car germanCar : germanCars) {
            if(germanCar!=null) {
                System.out.println(germanCar);
            }
        }
        System.out.println("=== MOST EXPENSIVE CAR ===");
        System.out.println(expensiveCar[0]);


    }
}
