package ford.b2.oops.exception.custom;

public class Account {
	private Double balance;
	
	public Account(Double balance) {
		this.balance=balance;
	}
	
	public Double withdraw(Double amount) throws AccountException,Exception {
		if(amount<=this.balance) {
			this.balance-=amount;
		}
		else
		{
			throw new AccountException("You have insuffient balance:" + this.balance);

//			try {
//				throw new AccountException("You have insuffient balance:" + this.balance);
//			} catch (AccountException e) {
//				// System.out.println("Insufficent Balance");
//			}
		}
		return this.balance;
	}

}
