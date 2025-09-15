package MentorLesson2Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Select movie genre:");
    System.out.println("Action "+ "Comedy "+ "Drama "+ "Animation");
    String genre = sc.nextLine();
    System.out.println("Select movie screening date:");
    System.out.println("Monday " + "Tuesday " + "Wednesday " + "Thursday " + "Friday " + "Saturday " + "Sunday" );
    String day = sc.nextLine();
    System.out.println("Your age category: ");
    System.out.println("Junior "+"Senior "+"Student");
    String age = sc.nextLine();

    double total = 0;

    switch(genre.toLowerCase()){

        case "action","drama" ->{
            total += 12;
        }
        case "comedy" -> {
            total += 10;
        }
        case "animation" -> {
            total += 8;
        }
        default ->{
            System.out.println("Unknown genre. Default price (10$) applied.");
            total += 10;
        }

    }

        boolean isWeekend = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        if (isWeekend) {
            total += 2;
            System.out.println("Weekend!(+2$) for tickets");
        }

    switch (age.toLowerCase()){
        case "junior":
            total-=2;
            System.out.println("Junior discount applied! (-2$)");
            break;
        case "student":
            total-=1;
            System.out.println("Student discount applied! (-1$)");
            break;



    }
        System.out.println("Total Price: " + total + '$');


}
}
