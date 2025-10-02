package MentorLesson2Classwork;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Hero!");
        System.out.println("1-Superman");
        System.out.println("2-Batman");
        System.out.println("3-Spiderman");

        int num = sc.nextInt();

        switch (num){

            case 1:
                System.out.println("Superman is greatful!");
                break;
            case 2:
                System.out.println("Batman is greatful!");
                break;
            case 3:
                System.out.println("Spiderman is greatful!");
                break;

        }

    }
}
