package MentorLesson4Classwork;

public class MultiTask4 {
    public static void main(String[] args) {
        String[][] array = new String [2][5];
        array[0][0] = "Defter";
        array[0][1] = "Kitab";
        array[0][2] =  "Qelem";
        array[0][3] =   "Vereq";
        array[0][4] =   "Canta";

        array[1][0] = "Notebook";
        array[1][1] = "Iphone";
        array[1][2] =  "Samsung";
        array[1][3] = "Qulaqciq";
        array[1][4] = "Fotoaparat";

        for (String[] mehsullar : array){
            for (String mehsul : mehsullar){
                System.out.print(mehsul + " ");
            }
            System.out.println("   ");

        }
    }
}
