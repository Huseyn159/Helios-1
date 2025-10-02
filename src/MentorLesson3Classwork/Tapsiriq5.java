package MentorLesson3Classwork;

import java.util.Random;
import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        int cehd = 3;
        Scanner sc = new Scanner(System.in);

        Random rnd = new Random();
        int randomnumber = rnd.nextInt(10);
        while(cehd>0){
            System.out.println("1-10 arasi reqem daxil edin: ");
            int reqem = sc.nextInt();
            if(reqem==randomnumber){
                System.out.println("Tebrikler");
                break;
            }
            else if (reqem!=randomnumber){
                cehd--;
                System.out.println("Yeniden cehd edin.Cehd sayi "+ cehd);

            }


        }
        if (cehd == 0) System.out.println("Uduzdunuz");

    }
}
