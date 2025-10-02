package MentorLesson5ClassWork;

public class Student {

 private String name;
 private int age;
 private int schoolNum;


    public Student(String name, int schoolNum, int age) {
        this.name = name;
        this.schoolNum = schoolNum;
        this.age = age;
    }


    void showInfo(){
        System.out.println("Name ->" + name);
        System.out.println("Age ->" + age);
        System.out.println("School Number ->" + schoolNum);
    }
}


