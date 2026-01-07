package BankAccountSystem;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Bank Account System...");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number :");
                    int accNo = sc.nextInt();
                    System.out.println("Enter your name: ");
                    String name = sc.next();
                    System.out.println("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bankService.createAccount(accNo, name, balance);
                    break;
                case 2:
                    System.out.println("Enter Account Number :");
                    accNo = sc.nextInt();
                    BankAccount acc1 = bankService.findAccount(accNo);
                        if(acc1!=null) {
                            System.out.println("Enter amount to deposit :");
                            acc1.deposit(sc.nextDouble());
                        }
                        else {
                            System.out.println("Account does not exist");
                        }
                    break;
                case 3:
                    System.out.println("Enter Account Number :");
                    accNo = sc.nextInt();
                    BankAccount acc2 = bankService.findAccount(accNo);
                        if(acc2!=null) {
                            System.out.println("Enter amount to withdraw :");
                            acc2.withdraw(sc.nextDouble());
                        }
                        else {
                            System.out.println("Account does not exist");
                        }
                    break;
                case 4:
                    System.out.println("Enter Account Number :");
                    accNo = sc.nextInt();
                    BankAccount acc3 = bankService.findAccount(accNo);
                         if(acc3!=null) {
                             System.out.println("Balance Amount :" + acc3.getBalance());
                         }
                         else {
                             System.out.println("Account does not exist");
                         }
                    break;
                case 5:
                    System.out.println("Thank you for using our Bank!...");
                    break;

                default:
                    System.out.println("Invalid choice, Try Again!...");
            }
        }
        while (choice != 5);
        sc.close();
    }
}
