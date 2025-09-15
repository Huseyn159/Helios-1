package Ltc1;

import java.util.Scanner;

public class firstm {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Enter ur name: ");
//        sc.nextLine();
//        String name = sc.nextLine();
//        System.out.println("R u local? ");
//        boolean isLocal = sc.nextBoolean();
//
//        System.out.println("Age: " + age);
//        System.out.println("Name: " + name);
//        System.out.println("Local: " + isLocal);

        Scanner sc = new Scanner(System.in);
//        System.out.println("First Price: ");
//        double price1 = sc.nextDouble();
//        System.out.println("Second Price: ");
//        sc.nextLine();
//        double price2 = sc.nextDouble();
//
//        double sum = price1 + price2;
//        double hasil = price2 * price1;
//        double qaliq = price2 % price1;
//
//        System.out.println("Sum price: " + sum);
//        System.out.println("Hasil: " +hasil );
//        System.out.println("Qaliq: " + qaliq);

//        System.out.println("First Price: ");
//        int price1 = sc.nextInt();
//        System.out.println("Second Price: ");
//        sc.nextLine();
//        int price2 = sc.nextInt();
//        System.out.println("Third Price: ");
//        int price3 = sc.nextInt();
//
//        int sum = price1 + price2 + price3;
//        int hasil = price2 * price1 * price3;
//        int avg = sum / 3;
//
//        System.out.println("Sum price: " + sum);
//        System.out.println("Hasil: " +hasil );
//        System.out.println("Average: " + avg);


        System.out.println("Daily Coffee: ");
        int coffee = sc.nextInt();
        System.out.println("Coffee Price: ");
        sc.nextLine();
        double price = sc.nextDouble();

        double xerc = (coffee + price) * 30;
        int cup = coffee / 5;

        System.out.println("Ayliq xerc: " + xerc);
        System.out.println("Her isciye dusen fincan: " + cup);


    }

}
