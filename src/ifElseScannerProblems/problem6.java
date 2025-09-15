package ifElseScannerProblems;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Ayliq geliriniz: ");
        double gelir = sc.nextDouble();
        System.out.println("Kiraye xerci: ");
        double kiraye = sc.nextDouble();
        System.out.println("Yemek xerci: ");
        double yemek = sc.nextDouble();
        System.out.println("Neqliyyat xerci: ");
        double neqliyyat = sc.nextDouble();

        double umumi_xerc = kiraye+yemek+neqliyyat;
        double qalan_pul = gelir - umumi_xerc;

        System.out.println("Yerde qalan pulunuz: " + qalan_pul + "$");

    }
}
