import java.math.BigInteger;
import java.util.Scanner;

// Menu Design
class MenuDesign {
    static void MDesign() {
        System.out.println("Welcome To Number Record Portal");
        System.out.println("1. NUMBER RECORD DATA ");
        System.out.println("2. NUMBER SHOW DATA ");
        System.out.println("3. EXIT");
        System.out.println("Created By @mr_sakshamji");
    }
}

class MyMain {
    public static void main(String[] args) {
        // Scanner Class

        Scanner sc = new Scanner(System.in);

        // Menu Call


        MenuDesign.MDesign();


        int OptChoice = sc.nextInt();
        switch (OptChoice) {
            case 1: {
                //r1.Record();
                int userin;
                System.out.println("How many numbers do you want to save? ");
                userin = sc.nextInt();

                BigInteger[] str = new BigInteger[123];


                for (int i = 0; i < userin; i++) {
                    System.out.println("Enter Numbers For Save In Portal");
                    str[i] = sc.nextBigInteger();
                }

                System.out.println("Press 1 For Number Show Or Press 2 For Exit");
                int choice = sc.nextInt();
                if (choice == 1) {
                    for (int i = 0; i < userin; i++) {
                        System.out.println("Mobile Number = " + str[i]);

                    }
                    System.out.println("Thank You!");


                } else if (choice == 2) {
                    System.out.println("Thank You");
                } else {
                    System.out.println("Invalid Choice! FORCEFULLY EXITED THE PROGRAM");
                }
                break;
            }
            case 2: {
                System.out.println("NO DATA AVAILABLE");
                //r1.Record();
                System.out.println("Press 1 For Save A New Number Or Press 2 For Exit");
                int op = sc.nextInt();
                if (op == 1) {
                    int userin;
                    System.out.println("How many number you want to save ");
                    userin = sc.nextInt();

                    BigInteger[] str = new BigInteger[123];


                    for (int i = 0; i < userin; i++) {
                        System.out.println("Enter Numbers For Save In Portal");
                        str[i] = sc.nextBigInteger();
                    }

                    System.out.println("Press 1 For Number Show Or Press 2 For Exit");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        for (int i = 0; i < userin; i++) {
                            System.out.println("Mobile Number = " + str[i]);
                            System.out.println("Thank You!");
                        }


                    }
                } else if (op == 2) {
                    System.out.println("Thank You");
                } else {
                    System.out.println("INVALID CHOICE! FORCEFULLY EXITED THE PROGRAM");
                }
                break;
            }
            case 3: {
                System.out.println("Thanks For Using");
                break;
            }
            default: {
                System.out.println("Invalid Input! Thank You!");
            }
        }


    }

}
