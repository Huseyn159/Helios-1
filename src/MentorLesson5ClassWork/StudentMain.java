package MentorLesson5ClassWork;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("Tofiq",167,15);
        Student st2 = new Student("Cavad",160,14);
        System.out.println("Ilk telebe");
        st1.showInfo();
        System.out.println("Ikinci telebe");
        st2.showInfo();
    }
}
