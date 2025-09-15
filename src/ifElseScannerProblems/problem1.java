package ifElseScannerProblems;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Top 1 qiymeti: ");
        double price1 = sc.nextDouble();
        System.out.println("Top 2 qiymeti: ");
        double price2 = sc.nextDouble();


        double cem = price1 + price2;
        double hasil = price1 * price2;
        double qaliq = 0;
        if(price1 > price2) {
             qaliq = price1 % price2;
        }
        else{
             qaliq = price2 % price1;
        }
        System.out.println(cem);
        System.out.println(hasil);
        System.out.println(qaliq);
    }
}
