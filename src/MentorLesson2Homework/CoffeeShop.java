package MentorLesson2Homework;

import java.util.Scanner;

public class CoffeeShop {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yasinizi daxil edin: ");
        int age = sc.nextInt();
        System.out.println("Zəhmət olmasa bir seçim edin:");
        System.out.println("1 - Espresso - 5$");
        System.out.println("2 - Latte - 4$");
        System.out.println("3 - Cappuccino - 6$");
        System.out.println("4 - Americano - 7$");
        System.out.println("5 - Çıxış");

        int secim = sc.nextInt();
        int total = 0;

        switch (secim) {

            case 1:
                System.out.println("Espresso hazirlanir...");
                total+=5;
                break;
            case 2:
                System.out.println("Latte hazirlanir...");
                total+=4;
                break;
            case 3:
                System.out.println("Cappuccino hazirlanir...");
                total+=6;
                break;
            case 4:
                System.out.println("Americano hazirlanir...");
                total+=7;
                break;
            case 5:
                System.out.println("Helelik!");
                break;
            default:
                System.out.println("Xetali secim");


        }

        if (age<12){

            System.out.println("12 yasdan kiciklere icki pulsuz!");
        } else if (age >12 && age<18) {
            total-=2;
            System.out.println("2$ telebe endirimi.Son qiymet: " + total + '$');
            
        }
        else if (age>65) {
            total-=3;
            System.out.println("3$ yashli endirimi.Son qiymet: " +  total +'$');

        }
    }
}