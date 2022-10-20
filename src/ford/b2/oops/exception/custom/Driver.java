package ford.b2.oops.exception.custom;

public class Driver {

	public static void main(String[] args)  {

		Account account = new Account(100.0);
		try {
			
				account.withdraw(150.0);
			
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End of app.");
	}

}
