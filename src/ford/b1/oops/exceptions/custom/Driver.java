package ford.b1.oops.exceptions.custom;

public class Driver {

	public static void main(String[] args) {
		
		Account account = new Account(1000.0);
		try {
			account.withdraw(1500.0);
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

	}

}
