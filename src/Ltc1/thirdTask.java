package Ltc1;
import java.util.Scanner;
public class thirdTask {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
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
