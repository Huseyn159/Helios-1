package ifElseScannerProblems;

import java.util.Scanner;

//ROAD TRIP
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Distance to Travel: ");
        int distance = sc.nextInt();
        System.out.println("Distance with 1L: ");
        int fuel= sc.nextInt();

        int needed_fuel=distance/fuel;
        double fuel_fee = needed_fuel * 1.8;

        System.out.println("You need " + needed_fuel + "L fuel,and it will cost you " + fuel_fee + "$");

    }
}
