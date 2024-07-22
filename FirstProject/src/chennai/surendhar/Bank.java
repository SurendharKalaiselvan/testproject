package chennai.surendhar;

public class Bank {
	  private static int bank_balance = 1000000;//class specific
	  
	  Bank()
	  {
	    System.out.println("Bank Constructor");
	  }
	  
	  void withdraw(int amount)
	  {
	    bank_balance = bank_balance - amount; 
	  }
	  void deposit(int amount)
	  {
	    System.out.println(bank_balance);
	    bank_balance = bank_balance + amount;
	    System.out.println(bank_balance);
	  }
	  private void give_salary()
	  {
	    
	  }

	}