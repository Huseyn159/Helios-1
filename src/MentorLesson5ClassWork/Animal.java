package MentorLesson5ClassWork;

public class Animal {
    void eat(){
        System.out.println("Nyom Nyom");
    }
    void sound(){
        System.out.println("Default sound");
    }
}

 class Dog extends Animal{

    void bark(){
        System.out.println("Vouf vouf!");
    }
    @Override
     void sound(){
        System.out.println("barking");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Meow!");
    }
}
