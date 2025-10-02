package MentorLesson4Classwork;
import java.util.Arrays;

public class MultiArraySort {
    public static void main(String[] args) {
        int[][] unsortedArray = {
                {3,1,2},
                {5,9,6},
                {7,8,4}
        };
        for (int[] reqemler : unsortedArray){
            Arrays.sort(reqemler);
            for (int reqem : reqemler){

                System.out.print(reqem + " ");
            }

            System.out.println("  ");
        }
    }
}
