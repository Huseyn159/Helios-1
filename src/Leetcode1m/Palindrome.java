package Leetcode1m;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teze = "";
        System.out.println("Metn daxil et: ");

        String pal = sc.nextLine();
        pal = pal.toLowerCase();
        boolean isPalendrome = true;

        for(int i=0;i<pal.length();i++){
            char ch = pal.charAt(i);
            if(ch>='a' && ch <= 'z'){
               teze+=ch;
            }

        }
        int sol = 0;
        int sag = teze.length()-1;
        while(sag>=sol){
            if (teze.charAt(sol)!=teze.charAt(sag)){
                isPalendrome=false;

                break;

            }

            sag--;
            sol++;
        }
        if (isPalendrome) {
            System.out.println(teze + " Palendromdur");
        }
        else {
            System.out.println(teze + " Palendrome deyil");
        }
    }
}
