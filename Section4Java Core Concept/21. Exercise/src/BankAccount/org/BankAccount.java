package BankAccount.org;

public class BankAccount {
	private double balance;
public BankAccount(double initialBalance) {
	this.balance=initialBalance;
}
public double getBalance(){
	return balance;
}
public void desposit(double amount) {
	balance+=amount;
}
public void withdraw(double amount) {
	if(amount<=balance) {
		balance-=amount;
	}
	else {
		System.out.println("Insufficient Funds......");
	}
}
}
