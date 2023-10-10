import java.util.Scanner;
public class ATM {
private double  balance;
public ATM ( double initialBalance) {
	this.balance =initialBalance;
		}
public void deposit (double amount) {
	if (amount>0) {
		balance +=amount;
		System.out.println("Deposit successful.New balance:Rs"+ balance);
			}
		else {

				System.out.println("Invalid amount for deposit.");

				}
				}

				public void withdraw(double amount) {

				if (amount > 0 && amount <= balance) {

				balance= balance-amount;

				System.out.println("Withdrawal successful. New balance: Rs" +balance);
				}
				else {
				
				System.out.println("insufficient balance .");
				}
				}
				public double getBalance() {
						return balance;
				}

					public static void main(String[] args) {

					ATM atm =new ATM(1000.0); 
					Scanner  scanner = new Scanner(System.in);

					while (true) {
               System.out.println("******** WELCOME***********");
					System.out.println( "ATM Menu: ");

					System.out.println("1. Check Balance");

					System.out.println("2. Deposit");

					System.out.println("3. Withdraw");

					System.out.println("4. Exit");

					System.out.print( "Enter your choice you want to perform the operation: ");

					int choice = scanner.nextInt();
					System.out.println("---------------------------------------------");

					switch (choice) {

			case 1: System.out.println("Current balance: Rs" + atm.getBalance());
					break;
					
			 case 2:	System.out.print("Enter the deposit amount: Rs "); 
					double depositAmount = scanner.nextDouble(); 
					atm.deposit (depositAmount);
						break;
			case 3:
						System.out.print("Enter the withdrawal amount: Rs ");

						double withdrawAmount = scanner.nextDouble();
						atm.withdraw(withdrawAmount);
						break;
			case 4:
						System.out.println("Thanks for using AtM");

						System.exit(0); 
				default:

				System.out.println("Invalid choice. Please select a valid option.");
					}
					}
					}
					}
