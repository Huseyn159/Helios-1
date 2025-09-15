package MentorLesson2Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Price of book: ");
        int book = sc.nextInt();
        System.out.println("Price of Notebook: ");
        int note = sc.nextInt();

        int sum = note + book;

        if(sum>50){
            System.out.println("Free shipping for purchases over 50$!");
        }
        else {
            System.out.println("Total:"+sum);
        }


    }
}
