package ford.b1.oops.exceptions.custom;

public class Account {
	private Double balance;

	public Account() {
		
	}
	public Account(Double balance) {
		this.balance = balance;
	}

	public Double withdraw(Double amount) throws AccountException{
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			//System.out.println("Insufficent balance.");
			throw new AccountException("Insufficent balance. Balance:" + this.balance);
		}
		return balance;
	}

}
