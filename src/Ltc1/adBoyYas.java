package Ltc1;

import java.util.Scanner;

public class adBoyYas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Adinizi daxil edin: ");
        String name = sc.nextLine();
        System.out.println("Yasinizi daxil edin: ");
        int age = sc.nextInt();
        System.out.println("Boyunuzu daxil edin: ");
        double height = sc.nextDouble();

        if (height<1.80 || age<18){

            System.out.println("Hormetli " + name + " siz uygunsuz namizedsiz" );
        }
        else {
            System.out.println("Hormetli " + name + " sizin yasiniz " + age + " boyunuz " + height + ".Ugurlu muraciet");
        }
    }
}
