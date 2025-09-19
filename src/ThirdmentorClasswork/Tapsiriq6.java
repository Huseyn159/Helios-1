package ThirdmentorClasswork;

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soz daxil edin");
        String soz = sc.nextLine();
        soz = soz.toLowerCase();
        int a = 0;
        for (int i = 0;i<soz.length();i++){
            if (soz.charAt(i) == 'a'){
                a++;
            }

        }
        if(a>0){
            System.out.println("Sozde " + a + " a herfi var");
        }
        else {
            System.out.println("A herfi yoxdur");
        }

    }
}
