package Projects;
import java.util.*;
public class BankingApplication {
	public static void main(System[] args) {
		Scanner sc = new Scanner(System.in);
		double balance=0.0;
		while(true) {
			System.out.println("**** Welcome to Banking Application****");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				checkBalance(balance);
				break;
			case 2:
				balance = depositMoney(sc,balance);
				break;
			case 3:
				balance = withdrawMoney(sc,balance);
				break;
			case 4:
				System.out.println("Thank you for using Banking Application.Good Bye!!");
				sc.close();
				return;
			default:
				System.out.println("Invalid option! please try again");
			}
		}
	}
 public static void checkBalance(double balance) {
				System.out.println("Your current balance is: ₹" + balance);
			}
 public static double depositMoney(Scanner sc,double balance) {
	 System.out.println("Enter the amount to deposit: ₹");
	 double deposit = sc.nextDouble();
	 if (deposit > 0) {
         balance += deposit;
         System.out.println("₹" + deposit + " has been deposited. New balance: ₹" + balance);
     } else {
         System.out.println("Invalid deposit amount! Please enter a positive number.");
     }
     return balance;
 }
		public static double withdrawMoney(Scanner sc,double balance) {
			System.out.print("Enter the amount to withdraw: ₹" );
			double withdraw = sc.nextDouble();
			if(withdraw > 0 && withdraw <= balance) {
				balance -= withdraw;
				System.out.println("₹" + withdraw + " has been withdrawn. Remaining balance: ₹" + balance);
	        } else if (withdraw > balance) {
	            System.out.println("Insufficient funds! Your balance is: ₹" + balance);
	        } else {
	            System.out.println("Invalid withdraw amount! Please enter a positive number.");
	        }
	        return balance;
	    }
}