package Ltc1;
import java.util.Scanner;
public class secondTask {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("First Price: ");
        int price1 = sc.nextInt();
        System.out.println("Second Price: ");
        sc.nextLine();
        int price2 = sc.nextInt();
        System.out.println("Third Price: ");
        int price3 = sc.nextInt();

        int sum = price1 + price2 + price3;
        int hasil = price2 * price1 * price3;
        int avg = sum / 3;

        System.out.println("Sum price: " + sum);
        System.out.println("Hasil: " +hasil );
        System.out.println("Average: " + avg);

    }
}
