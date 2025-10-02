package MentorLesson5ClassWork;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cars you want to add?");
        int carSum = sc.nextInt();
        sc.nextLine();
        Car[] carDetails = new Car[carSum];

        for(int i = 0;i<carDetails.length;i++){
            System.out.println((i+1) + ". Masin brendini daxil edin");
            String brand = sc.nextLine();
            System.out.println((i+1) +  ". Masin modelini daxil edin");
            String model = sc.nextLine();
            System.out.println((i+1) + ". Masin ilini daxil edin");
            int year = sc.nextInt();
            sc.nextLine();

            carDetails[i]= new Car(brand,model,year);

        }

        for(Car car:carDetails){
            car.showDetails();
        }






    }
}
