package ifElseScannerProblems;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dogum iliniz: ");
        int birth= sc.nextInt();

        int verify = 2025 - birth;
        if (verify<18){
            System.out.println("Xidmet yasiniza uygun deyil!");

        }
        else {
            System.out.println("Xosh geldiniz!");
        }


    }
}
