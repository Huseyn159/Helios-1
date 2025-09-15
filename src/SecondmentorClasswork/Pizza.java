package SecondmentorClasswork;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ur favorite pizza");
        String pizza = sc.nextLine();

        if(pizza.equalsIgnoreCase("Peperoni")){
            System.out.println("Peperoni is preparing!");
        }
        else if (pizza.equalsIgnoreCase("Hawaii")) {
            System.out.println("Hawaii is preparing!");
        }
        else if (pizza.equalsIgnoreCase("Salami")) {
            System.out.println("Salami is preparing");

        }
        else {
            System.out.println("Sorry!Out of stock!");
        }


    }
}
