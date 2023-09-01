package BankAccount.org;

public class CheckingAccount extends BankAccount {
	private double overDraftFee;
	public CheckingAccount(double initialBalance,double overDraftFee) {
		super(initialBalance);
		this.overDraftFee=overDraftFee;
		
	}
	public void withdraw(double amount) {
		if(amount <=getBalance()) {
			super.withdraw(amount);
		}
		else {
			System.out.println("Overdraft fee applied");
			super.withdraw(amount+overDraftFee);
		}
	}

}
