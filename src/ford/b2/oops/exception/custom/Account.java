package ford.b2.oops.exception.custom;

public class Account {
	private Double balance;
	
	public Account(Double balance) {
		this.balance=balance;
	}
	
	public Double withdraw(Double amount)throws AccountException {
		if(amount<=this.balance) {
			this.balance-=amount;
		}
		else
		{
			throw new AccountException("You have insuffient balance:"+this.balance);
			//System.out.println("Insufficent Balance");
		}
		return this.balance;
	}

}
