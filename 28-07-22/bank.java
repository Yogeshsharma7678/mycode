/*program to print details or add/open any 
   of customer in bank 
 */
import java.util.*;
class bank   
{
  public static void main(String args[])       /*initializing all variables in the 
                                                   main class
												   */
   { int AccNumber=456231789;
     String AccName="Arun";
	 int AccBalance=15000;
	 int amount=1000;
	 
     customer c = new customer();               //creating object for calling customer class
	 c.setAmount(AccNumber,AccName,AccBalance);  /*calling setAmount method by
	                                                 using customer class object*/
	 c.getAmount();   //calling getAmount method
	 
	 System.out.println("---depositing---");
	 
     c.deposit(amount);
	 c.getAmount();
	 
   }
}
 class customer
 {  //declare private variables for customr class
    private int accountNumber, accountBalance;
	private String accountName;

    //method to add details of customer
	public void setAmount(int accNumber,String accName,int accBalance)
    {  
	  accountNumber=accNumber;
	  accountName=accName;
	  accountBalance=accBalance;
	
	}
     //creating method to deposite money
	public void deposit(int Amount)
	{
		
		accountBalance+=Amount;  
		
	}
	
	/*this method is created for print all
	details and mainipulation
	*/
	public void getAmount() {
		
		System.out.println("Hello!" +accountName+ " you're Welcome , " + "your account number is "+accountNumber+ " and balance is Rs."+accountBalance);
	}
 }