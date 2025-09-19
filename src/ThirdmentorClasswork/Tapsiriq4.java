package ThirdmentorClasswork;

import java.util.Random;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = 0;
        while(i<=10){
            i++;
            int randomnumber = rnd.nextInt(100);
            System.out.println(randomnumber);
        }

    }
}
