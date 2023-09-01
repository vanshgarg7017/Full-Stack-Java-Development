package BankAccount.org;

public class Main {
public static void main(String[] args) {
	BankAccount saving=new SavingAccount(2000,650);
	BankAccount checking =new CheckingAccount(1000,100);
	withdrawFromAccount(saving,300);
	withdrawFromAccount(checking,250);
	System.out.println("Saving Account is :"+saving.getBalance());
	System.out.println("Checking Account is :"+checking.getBalance());
}

private static void withdrawFromAccount(BankAccount account, double amount) {
	account.withdraw(amount);
}
}
