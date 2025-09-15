package ifElseScannerProblems;

import java.util.Scanner;

public class swCoffeeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət olmasa bir seçim edin:");
        System.out.println("1 - Espresso");
        System.out.println("2 - Latte");
        System.out.println("3 - Cappuccino");
        System.out.println("4 - Americano");
        System.out.println("5 - Çıxış");

        int secim = sc.nextInt();

        switch (secim){

            case 1:
                System.out.println("Espresso hazirlanir...");
                break;
            case 2:
                System.out.println("Latte hazirlanir...");
                break;
            case 3:
                System.out.println("Cappuccino hazirlanir...");
                break;
            case 4:
                System.out.println("Americano hazirlanir...");
                break;
            case 5:
                System.out.println("Helelik!");
                break;
            default:
                System.out.println("Xetali secim");

        }




    }
}
