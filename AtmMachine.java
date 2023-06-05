
import java.util.*;

public class AtmMachine {
    public static void main(String[] args) {


    // need to ask username
    // Pin
    // deposit , withdraw Balance, exit

        int amount = 500;
        int user_input;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();

    System.out.println("Enter your Pin");
    int pin = sc.nextInt();


        do {
        System.out.println("Welcome " + name + " Please choose one of the option from below");
        System.out.println("Press 1 for deposit");
        System.out.println("Press 2 Withdraw Amount");
        System.out.println("Press 3 to see Balance");
        System.out.println("Press 4 exit");
        // Taking input from user
        user_input = sc.nextInt();

        // deposit

            if (user_input == 1) {

                System.out.println("Enter the amount to deposit");
                int deposit = sc.nextInt();
                amount = amount + deposit;
                System.out.println("***** amount has been successfully deposited");

            }

            // Withdraw

            else if (user_input == 2) { //2
                System.out.println("Please enter the amount to withdraw");
                int withdrawcash = sc.nextInt(); //30
                if (withdrawcash <= amount)
                {
                    amount = amount - withdrawcash;
                    System.out.println("***** amount has been successfully withdraw");
                    System.out.println("Your available balance is :" + amount);

                }
                else {
                    System.out.println("Insufficient Balance");
                    break;
                    }
            }

            // balance
        else if (user_input == 3) {
                System.out.println("Your available balance is: " + amount);
            }

        }while(user_input !=4);

        System.out.println("Thank you for choosing the Dinesh bank. Have a nice day!");




  }
}
