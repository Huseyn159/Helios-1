package ifElseScannerProblems;

import java.util.Scanner;

public class swCalculatorProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aparmaq istediyiniz emeliyyati secin: ");
        System.out.println("1-Toplama");
        System.out.println("2-Cixma ");
        System.out.println("3-Bolme");
        System.out.println("4-Vurma");

        int emel = sc.nextInt();


        System.out.println("Birinci reqem");
        int num1 = sc.nextInt();
        System.out.println("Ikinci reqem");
        int num2 = sc.nextInt();

        switch (emel){

            case 1:
                int cem = num1 + num2;
                System.out.println("Cem: "+cem);
                break;
            case 2:
                int cixma = num1 - num2;
                System.out.println("Cixma: " + cixma);
                break;
            case 3:
                if (num2 == 0){
                    System.out.println("Sifira bolmek olmaz!");

                }else {
                    int bolme = num1/num2;
                    System.out.println("Bolme: " + bolme);

                }
                break;
            case 4:
                System.out.println("Hasil: "+num1*num2);

                break;
            default:
                System.out.println("Emel secimi sehvdir");

        }


    }
}
