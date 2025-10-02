package FirstMiniProjects;


import java.util.Random;
import java.util.Scanner;

public class AdvantureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Enter your name: ");
        String nick = sc.nextLine();
        String character = "";
        int playerHP = 0;
        int playerAttack = 0;
        int score = 0;
        System.out.println("Choose your character:");
        System.out.println("1 - Knight (HP: 100, Attack: 20)");
        System.out.println("2 - Wizard (HP: 70, Attack: 30)");
        System.out.println("3 - Archer (HP: 80, Attack: 25)");
        int classChoice = sc.nextInt();

        switch (classChoice){
            case 1:
                character = "Knight";
                playerHP = 100;
                playerAttack = 20;
                break;
            case 2:
                character = "Wizard";
                playerHP = 70;
                playerAttack = 30;
                break;
            case 3:
                character = "Archer";
                playerHP = 80;
                playerAttack = 25;
                break;

        }

        String[] enemyTypes = {"Goblin","Orc","Troll","Black Knight","Fallen Lord"};
        int[] enemyHps = {30,45,60,110,200};
        int[] enemyAttacks = {5,10,15,20,25};

           oyunloopu:
           while(playerHP>0){
               if(playerHP<50) playerHP+=15;
               int enemyIndex = rnd.nextInt(enemyTypes.length);
               String enemyName = enemyTypes[enemyIndex];
               int enemyHP = enemyHps[enemyIndex];
               int enemyAttack = enemyAttacks[enemyIndex];

               System.out.println("\n⚠️ " + enemyName + " appeared") ;
               System.out.println("Enemy HP: " + enemyHP + "❤️");

               while(enemyHP>0){
                   int defenceroll = rnd.nextInt(15);
                   int attackroll = rnd.nextInt(10);
                   System.out.println("What will you do?");
                   System.out.println("Your HP: " + playerHP);
                   System.out.println("1- ATTACK");
                   System.out.println("2- DEFEND AND HEAL");
                   System.out.println("3- TRY TO ESCAPE");

                   int action = sc.nextInt();

                   switch (action){

                       case 1:
                           System.out.println("You dealt -"+ (playerAttack+attackroll)+ " to " + enemyName );
                           enemyHP-=(playerAttack+attackroll);
                           int counterattack = enemyAttack-defenceroll;
                           playerHP-=counterattack;
                           System.out.println(enemyName + " dealt you " + counterattack + " counter damage");
                           System.out.println("Current Enemy HP: " + enemyHP + "❤️");
                           break;
                       case 2:
                           System.out.println(enemyName + " attacked you");
                           int defenceenemyattack = enemyAttack-(defenceroll+5);
                           if (defenceenemyattack<0){
                               playerHP+=(-defenceenemyattack);
                               System.out.println("You defended " +(defenceroll+2)+" and healed "+ (-defenceenemyattack) + "❤️HP");

                           } else if (defenceenemyattack>0) {
                               playerHP-=defenceenemyattack;
                               System.out.println("You defended " +(defenceroll+2)+" and took "+ defenceenemyattack + "HP damage.Failed to Heal");
                           }


                          break;
                       case  3:
                           if(rnd.nextBoolean()){
                               System.out.println("You successfully escaped!");
                               continue oyunloopu;
                           }
                           else {
                               System.out.println("Failed to escape!");
                               playerHP -= enemyAttack;
                               System.out.println(enemyName + " hits you for " + enemyAttack + " damage.");
                           }
                       default:
                           System.out.println("Select correct choice!");
                           continue oyunloopu;





                   }


               }


           }

    }
}
