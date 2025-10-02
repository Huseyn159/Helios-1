package MentorLesson2Classwork;

import java.util.Scanner;

public class Ageverify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int age = sc.nextInt();

        if (age>18){

            System.out.println("Succsess");
        }
        else {
            System.out.println("U are not allowed");
        }


    }
}
