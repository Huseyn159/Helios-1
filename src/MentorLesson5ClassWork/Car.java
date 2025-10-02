package MentorLesson5ClassWork;

public class Car {
     String brand;
     String model;
     int year;

    public Car(String brand, String model,int year ) {
        this.year = year;
        this.model = model;
        this.brand = brand;
    }

    void showDetails(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("-------------------------");

    }



}