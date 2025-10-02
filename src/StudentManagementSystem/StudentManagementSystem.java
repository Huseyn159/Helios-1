package StudentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students. ");
        int num = sc.nextInt();
        sc.nextLine();
        String[] students = new String[num];
        int[] grades = new int[num];
        int[] ages = new int[num];
        char[] letterGrades = new char[num];
        boolean[] passed = new boolean[num];

        for(int i=0;i<students.length;i++){
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Enter student's name: ");
            String name = sc.nextLine();

            System.out.println("Enter student's age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student's grade: ");
            int grade = sc.nextInt();
            sc.nextLine();
            char letterGrade;
            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            boolean status = grade >= 60;

            students[i]=name;
            grades[i]=grade;
            ages[i]=age;
            letterGrades[i]=letterGrade;
            passed[i]=status;

        }






        int choice;
        do {
            System.out.println("1. Bütün tələbələri göstər");
            System.out.println("2. Statistikaları göstər");
            System.out.println("0. Çıxış");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        System.out.printf("%-15s %-10d %-10d %-10s %-10b\n",
                                students[i], grades[i], ages[i], letterGrades[i], passed[i]);
                    }
                    break;
                case 2:
                    int averageGrade=0;
                    int sum = 0;
                    for (int grade:grades){
                        sum+=grade;
                    }

                    averageGrade = sum/num;
                    System.out.println("Class Average Grade: " + averageGrade);

                    int averageAge = 0;
                    int totalAge = 0;
                    for (int age:ages){
                        totalAge+=age;
                    }
                    averageAge = totalAge/num;
                    System.out.println("Class Average Age: " + averageAge);




                    break;
                case 0:
                    System.out.println("Çıxılır...");
                    break;
                default:
                    System.out.println("Yanlış seçim!");
            }
        } while (choice != 0);




    }
}
