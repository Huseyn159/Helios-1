package Ltc1;
import java.util.Scanner;
public class icecream {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("First Price: ");
        double price1 = sc.nextDouble();
        System.out.println("Second Price: ");
        sc.nextLine();
        double price2 = sc.nextDouble();

        double sum = price1 + price2;
        double hasil = price2 * price1;
        double qaliq = price2 % price1;

        System.out.println("Sum price: " + sum);
        System.out.println("Hasil: " + hasil);
        System.out.println("Qaliq: " + qaliq);
    }
}
