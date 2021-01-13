import java.util.Scanner;

public class Account {
	//Class Variables
	int balance;
	int previousBalance;
	String customerName;
	String customerId; 
	
	Account (String name, String id){
		customerName = name;
		customerId = id;
	}
	
	void deposit(int amount) {
		if(amount != 0)
		{
			balance = balance + amount;
			previousBalance = amount;
		}
	}
	
	void withdrawal (int amount) {
		if(amount != 0)
		{
			balance = balance - amount;
			previousBalance =  - amount;
		}
	}
	
	void getPreviousTransaction () {
		if(previousBalance > 0)
		{
			System.out.println("Deposited " + previousBalance);
		}
		else if (previousBalance < 0)
		{
			System.out.println("Withdrawn " + Math.abs(previousBalance));
		}
		else 
		{
			System.out.println("No Trasaction Occured");
		}
	}
	
	void getInterestRate(int years) {
		double rate = 0.185;
		double newbalance = (balance * rate * years) + balance;
		System.out.println("The current interest rate is " + (100 * rate) + "%");
		System.out.println("After " + years + " years, your balance will be " + newbalance);
	}
	
	void showmenu() {
		char option;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to First Bank " + customerName + "!");
		System.out.println("Your Id: " + customerId);
		System.out.println();
		System.out.println("Your Id: " + customerId);
		System.out.println();
		System.out.println("What would You like to do Today? ");
		System.out.println();
		System.out.println("B: Check Balance");
		System.out.println("D: Make Deposit");
		System.out.println("W: Make Withdrawal");
		System.out.println("T: View Previous Transaction");
		System.out.println("I: View Interest Rate");
		System.out.println("E: Exit");
		
		do
		{
			System.out.println();
			char tempOption = scanner.next().charAt(0);
			option = Character.toUpperCase(tempOption);
			System.out.println();
			
			
			switch(option) {
			
			case 'B' :
				System.out.println("####################################");
				System.out.println("Balance is $" + balance);
				System.out.println("####################################");
				System.out.println();
				break;
			
			case 'D' :
				System.out.println("Enter an amount: ");
				int money = scanner.nextInt();
				deposit(money);
				System.out.println(money + " has been deposited successfully!");
				System.out.println();
				break;
				
			case 'W' :
				System.out.println("Enter an amount: ");
				int withdrawMoney = scanner.nextInt();
				withdrawal(withdrawMoney);
				System.out.println(withdrawMoney + " has been withrawn from your account!");
				System.out.println();
				break;
				
			case 'T' :
				System.out.println();
				System.out.println("####################################");
				getPreviousTransaction();
				System.out.println("####################################");
				break;
				
			case 'I' :
				System.out.println();
				System.out.println("####################################");
				System.out.println("How many years? ");
				int IntYears = scanner.nextInt();
				getInterestRate(IntYears);
				break;
				
			case 'E' :
				System.out.println("####################################");
				break;
				
			default :
				System.out.println("Invalid Option - Choose between  B,D,W,T,I,E");
				break;
			}
			
			
			
		}while (option != 'E');
		System.out.println("Thank You for Banking with us" + customerName);
		}
}
