package ifElseScannerProblems;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ticket Price: ");
        double price = sc.nextDouble();
        System.out.println("How many tickest you want: ");
        int tickets = sc.nextInt();

        double final_price = price * tickets;

        if (tickets > 5) {

            final_price = final_price - (final_price * 10) / 100;


        }
        System.out.println("Yekun qiymet: " + final_price);
    }
}
