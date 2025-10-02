package MentorLesson4Classwork;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = {1,6,8,9,7};
        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            if(num>max){
                max=num;
            }
            else if (num<min) {
                min=num;

            }
        }
        System.out.println(min + " Minimumdur");
        System.out.println(max + " Maksimumdur");
    }
}
