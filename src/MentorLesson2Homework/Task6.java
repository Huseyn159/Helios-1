package MentorLesson2Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilk tam ededi daxil et: ");
        int first = sc.nextInt();
        System.out.println("Ikincini daxil et: ");
        int second = sc.nextInt();
        sc.nextLine();
        System.out.println("Bir operator sec: +,-,*,/");
        char opr = sc.nextLine().charAt(0);

        int result = 0;

        switch (opr) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("0-a bölmək olmaz.");
                    return;
                }
                break;
            default:
                System.out.println("Yanlış operator daxil edildi.");
                break;
        }

        System.out.println("Nəticə: " + result);
    }
}



