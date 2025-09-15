package ifElseScannerProblems;

import java.util.Scanner;

public class swValyutaProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Deyismek istediyiniz AZN miqdarini daxil edin: ");

        double manat = sc.nextDouble();

        System.out.println("Tesekkurler!Valyuta secimi edin:");
        System.out.println("1 - USD (1 USD = 1.7 AZN)  ");
        System.out.println("2 - EUR (1 EUR = 1.85 AZN)    ");
        System.out.println("3 - TRY (1 TRY = 0.095 AZN)  ");

        int secim = sc.nextInt();

        switch (secim){

            case 1:
               double usd =  manat/1.7;
                System.out.println("Buyrun,"+usd+"USD");
                break;
            case 2:
                double eur = manat/1.85;
                System.out.println("Buyrun,"+eur+"EUR");
                break;
            case 3:
                double tr =  manat*95 ;
                System.out.println("Buyrun,"+tr+"TRY");
                break;
            default:
                System.out.println("Diqqet!Xetali secim!");

        }

    }
}
