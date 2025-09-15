package MentorLesson2Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paylaşımın mətn uzunluğunu daxil edin:");
        int metn = sc.nextInt();
        System.out.println("Şəkil var?");
        boolean sekil = sc.nextBoolean();
        System.out.println("Beyenilme sayi:");
        int like = sc.nextInt();

        if (metn > 100 || like > 500){
            System.out.println("Populyar paylasimdir!");
        }
        else if (sekil || metn >50){
            System.out.println("Maraqli paylasimdir!");
        }
        else {
            System.out.println("Standart paylasimdir!");
        }

    }
}
