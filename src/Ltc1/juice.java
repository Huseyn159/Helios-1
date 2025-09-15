package Ltc1;

import java.util.Scanner;

public class juice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Banan siresi ml: ");
        int banan = sc.nextInt();
        System.out.println("Kaktus siresi ml: ");
        int kaktus = sc.nextInt();

        int sum = banan+kaktus;
        int stekan = sum/250;

        if(sum<250){
            System.out.println("Teessuf bu bir stekani doldurmur");
        } else if (sum>250) {


        System.out.println("Vay canına! Bu " + sum + "ml kosmik şirə edir! Bu isə " + stekan +" tam stəkan üçün kifayətdir!");
        }
    }
}
