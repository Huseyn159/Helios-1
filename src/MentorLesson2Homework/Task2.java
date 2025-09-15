package MentorLesson2Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age<18){
            System.out.println("Ticket price for junior:0.50$");

        }
        else if (age > 18) {

            System.out.println("Ticket price for senior:1.00$");
        }


    }
}
