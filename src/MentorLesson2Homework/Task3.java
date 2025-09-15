package MentorLesson2Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Our products: ");
        System.out.println("Milk:2.50$");
        System.out.println("Bread:1.20$");
        System.out.println("Egg:0.30$");
        System.out.println("Enter product name: ");
        String product = sc.nextLine();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        double total = 0;
        double discount=0;

        if (product.equalsIgnoreCase("Milk")){
            System.out.println("Product:Milk");
            System.out.println("Quantity:"+quantity);
            total = quantity * 2.5;


            if(total > 10){
                System.out.println("First price:"+total);
                discount = (total * 5)/100;
                System.out.println("Applied discount:5% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else if (total > 5){
                System.out.println("First price:"+total);
                discount = (total * 2)/100;
                System.out.println("Applied discount:2% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else {
                System.out.println("Total: "+ total + '$');
            }
        }
        else if (product.equalsIgnoreCase("Bread")){
            System.out.println("Product:Bread");
            System.out.println("Quantity:"+quantity);
            total = quantity * 1.2;


            if(total > 10){
                System.out.println("First price:"+total);
                discount = (total * 5)/100;
                System.out.println("Applied discount:5% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else if (total > 5){
                System.out.println("First price:"+total);
                discount = (total * 2)/100;
                System.out.println("Applied discount:2% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else {
                System.out.println("Total: "+ total + '$');
            }
        }
        else if (product.equalsIgnoreCase("Egg")){
            System.out.println("Product:Egg");
            System.out.println("Quantity:"+quantity);
            total = quantity * 0.3;


            if(total > 10){
                System.out.println("First price:"+total);
                discount = (total * 5)/100;
                System.out.println("Applied discount:5% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else if (total > 5){
                System.out.println("First price:"+total);
                discount = (total * 2)/100;
                System.out.println("Applied discount:2% (" + discount + ")$");
                System.out.println("Last price: "+ (total-discount) + '$' );
            }
            else {
                System.out.println("Total: "+ total + '$');
            }
        }
        else {
            System.out.println("Product is not available!");
        }


    }
}
