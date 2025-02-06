import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        String correctaccountnumber = "12345";
        String correction = "6789";
        double balance = 1000.0;


      
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter account number: ");
        String accountnumber = input.nextLine();

    
        System.out.print("Enter pin: ");
        String pin = input.nextLine();

      
        if (accountnumber.equals(correctaccountnumber) && pin.equals(correction)) {
            System.out.println("Login Successful.");
       

        boolean loginjacob = true;
            while (loginjacob) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = input.nextInt();

                
                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: $" + balance);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = input.nextDouble();
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit + ". New balance: $" + balance);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = input.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrew: $" + withdraw + ". New balance: $" + balance);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting. Thank you for using the ATM.");
                        loginjacob = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid account number or PIN. Access denied.");
        }

        
    }
}
       
