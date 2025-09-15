package ifElseScannerProblems;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mentiq Baliniz: ");
        int bal1 = sc.nextInt();
        System.out.println("Xarici Dil Baliniz: ");
        int bal2 = sc.nextInt();
        System.out.println("Informatika Baliniz: ");
        int bal3 = sc.nextInt();


        int avg = (bal1+bal2+bal3)/3;

        if (avg>50){
            System.out.println("Tebrikler Kecdiniz!");
        }
        else {
            System.out.println("Kesildiniz!");
        }


    }
}
