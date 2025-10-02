package MentorLesson4Classwork;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 35, 95};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
             sum+=nums[i];

        }
        int avg = sum/nums.length;
        System.out.println(avg + " Ortalamadir");
    }
}
