package BankAccount.org;

public class SavingAccount extends BankAccount {

	private double withdrawLimit;

	public SavingAccount(double initialBalance, double withdrawLimit) {
		super(initialBalance);
		this.withdrawLimit=withdrawLimit;
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=withdrawLimit) {
		super.withdraw(amount);
	}else {
		System.out.println("WithdrawalLimit exceeded...");
	}
	}
	

}
