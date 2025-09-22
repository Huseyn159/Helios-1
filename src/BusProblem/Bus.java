package BusProblem;

import java.util.Random;
import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        System.out.println("Avtobusa minirsiniz...");
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        double randomnumber = rnd.nextDouble(1);
        double balance = randomnumber;
        System.out.println("Balansiniz: " + balance + "AZN");
        double fee = 0.7;



        do {
            System.out.println("Avtobusa minirsiniz...");
            if  (balance >= fee){
                balance-=fee;
                System.out.println("✅ Gediş haqqı ödənildi! Yeni balans: " + balance +   " AZN");
                break;
            }
            else if(balance <fee){
            System.out.println("❌ Balans kifayət etmir! (" + balance + "AZN)");
            System.out.println("Balansinizi artirin: ");
            double medaxil = sc.nextDouble();
            balance +=medaxil;
                System.out.println("✅ Yeni balans:" + balance + "AZN");}
            if(balance>=fee){
                System.out.println("Avtobusa minirsiniz...");
                balance-=fee;
                System.out.println("✅ Gediş haqqı ödənildi! Qaliq balans: " + balance +   " AZN");
                break;
            }
        }while(balance<fee);


    }
}
