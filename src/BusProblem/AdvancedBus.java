package BusProblem;

import java.util.Scanner;

public class AdvancedBus {
    public static void main(String[] args) {


        String[] users = {"Huseyn", "Fuad", "Cavad", "Tofiq"};
        String[] cardIds = {"1234", "2345", "3456", "4567"};
        Double[] balance = {2.7,0.3,0.6,1.5};

        double fare = 0.7;
        int foundindex = -1;
        double userBalance = 0;
        boolean notUser = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();


        for (int i = 0; i < users.length; i++) {

            if (name.equalsIgnoreCase(users[i])){

                foundindex = i;

                System.out.println("Welcome," + users[i] + ".Please enter your CardID: ");
                System.out.println("Please enter your CardID: ");
                String id = sc.nextLine();

                if(id.equals(cardIds[foundindex])) {
                    notUser=false;
                    userBalance += balance[foundindex];
                    System.out.println("Ugurlu giris");

                    break;
                }
            }

        }

                   if(notUser){
                         System.out.println("User not found");
                     }
                   else if (!notUser) {
                        System.out.println("Correct CardID");
                        System.out.println("1-Check balance");
                        System.out.println("2-Top up balance");
                        System.out.println("3-Get on the bus");
                        System.out.println("4-Log out");
                        int choice = sc.nextInt();


                        switch (choice) {
                            case 1:
                                System.out.println("Current Balance: " + userBalance + "AZN");
                                break;
                            case 2:
                                System.out.println("Enter amount for top up: ");
                                double topup1 = sc.nextDouble();
                                userBalance += topup1;
                                System.out.println("New Balance: " + userBalance + "AZN");
                                break;
                            case 3:
                                if (userBalance >= fare) {
                                    System.out.println("Balance -" + fare + "AZN Getting on bus...");
                                    userBalance -= fare;
                                    System.out.println("Remaining Balance: " + userBalance + "AZN.");
                                } else {
                                    while (userBalance < fare) {
                                        System.out.println("Not enough balance");
                                        System.out.println("Please top up your balance");
                                        System.out.println("Enter amount for top up: ");
                                        double topup2 = sc.nextDouble();
                                        userBalance += topup2;
                                        System.out.println("New Balance: " + userBalance + "AZN");
                                        if (userBalance >= fare) {
                                            System.out.println("Balance -" + fare + "AZN Getting on bus...");
                                            userBalance -= fare;

                                        }
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Goodbye," + users[foundindex] + '!');
                                break;
                            default:
                                System.out.println("Choose correct choice");
                                break;
                        }

                    }




        }

        }




