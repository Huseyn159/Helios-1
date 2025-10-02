package MentorLesson4Classwork;

public class MultiTask3 {
    public static void main(String[] args) {

      int[][] nums = {
              {0,1,2,3,1,0,3},
              {4,5,6,7,6,9,7},
              {8,8,9,9,5,2,1},
      };
        int max =nums[0][0];
        int min = nums[0][2];


        for (int[] num : nums) {
            for (int element : num) {
                if (element > max){
                    max=element;
                }
                else if(element < min){
                    min=element;
                }
            }
        }
        System.out.printf("Massivdəki ən böyük ədəd: %d\n", max);
        System.out.printf("Massivdəki ən kiçik ədəd: %d", min);
    }
}
