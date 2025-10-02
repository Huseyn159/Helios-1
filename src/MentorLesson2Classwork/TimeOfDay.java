package MentorLesson2Classwork;

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        System.out.println("0-23 arasi bir reqem secin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>24 || num<0){
            System.out.println("0-23 arasi secim edin!");
        }
        else if(num>=6 && num<=11){

            System.out.println("Sabahiniz Xeyir!");
        }
        else if(num>=12 && num<=17) {
            System.out.println("Günortanız xeyir!");
        }
        else if(num>=18 && num<=22) {
            System.out.println("Axşamınız xeyir!");
        }
        else if (num>=24 || num<=5) {
            System.out.println("Gecəniz xeyir!");

        }

    }
}
