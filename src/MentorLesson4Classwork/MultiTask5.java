package MentorLesson4Classwork;

import java.util.Scanner;

public class MultiTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notFound = true;
        String input = sc.nextLine();
        String[][] array = {
                {"Huseyn","Vilayet","Sahin"},
                {"Ilham","Behrem","Fikret"},
                {"Rahim","Cavad","Tofiq"}
        };
        for (String[] adlar : array){
            for (String ad:adlar){
                if(input.equalsIgnoreCase(ad)){
                    System.out.println(ad+" Xos Geldiniz!");
                    notFound=false;
                    break;
                }
            }
        }
        if (notFound) System.out.println("User not found");
    }
}
