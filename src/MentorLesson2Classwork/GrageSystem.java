package MentorLesson2Classwork;

import java.util.Scanner;

public class GrageSystem {
    public static void main(String[] args) {
        System.out.println("0-100 arasi bir reqem daxil edin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0 || num < 59) {
            System.out.println("'F' (Qeyri-kafi)");
        } else if (num >= 60 && num <= 69) {

            System.out.println("'D' (Kafi)");
        } else if (num >= 12 && num <= 79) {
            System.out.println("'C' (Orta)");
        } else if (num >= 80 && num <= 89) {
            System.out.println("'B' (Yaxşı)");
        } else if (num >= 90 && num <= 100) {
            System.out.println("'A' (Əla)");

        }
    }
}
