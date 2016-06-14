import java.awt.BorderLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Bank {
	
	private static Scanner reader;

	public static void main(String[] args)
	{
	   System.out.println("Welcome to Dalton Corp Savings and Loan");
	   
	   System.out.println("Please create the user account(s)");
   
	   reader = new Scanner(System.in);
	   
	   System.out.println("Enter an account # or -1 to stop entering accounts:");
	   String accountnumber=reader.next();
	   
	   if (accountnumber!="-1")
	   {
	    System.out.println("Enter the name for acct # "+accountnumber+": ");   
	   String Holdername=reader.next();
	   
	   System.out.println("Enter the balance for acct # "+accountnumber+": ");
	   String accountbalance=reader.next();
	      
	   
	   Createaccount.createaccounttable();   
	   Createaccount.createaccount(accountnumber, Holdername, accountbalance);
	   JTable accounttable=Createaccount.AccountTable;
	   
	   
	    
	   final JFrame frame = new JFrame("JTable Demo");
	   JScrollPane scrollPane= new JScrollPane(accounttable);
	   frame.getContentPane().setLayout(new BorderLayout());
	   
	   JLabel lblHeading = new JLabel("Dalton Bank");
 
	   
       frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
       frame.getContentPane().add(scrollPane,BorderLayout.CENTER);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(550, 200);
       frame.setVisible(true);
	   }
	   else 
	   {
		   System.out.println("Enter a transaction type (Check, Debit card, Deposit or Withdrawal) or -1 to finish: ");
		   
		   String transtype=reader.next();
		   
		   if (transtype=="C")
		   {
			   System.out.println("Enter the account # :");
			   String accountnumberforcheck=reader.next();
			   System.out.println("Enter the amount of the check: ");
			   String checkamount=reader.next();
			   System.out.println("Enter the date of the check: ");
			   String checkdate=reader.next();
			   
			   Check.createchecktable();
			   Check.createcheck(accountnumberforcheck, checkamount, checkdate);
			   JTable checktable=Check.CheckTable;
			   
			   JScrollPane scrollPane= new JScrollPane(checktable);
			   
			   
		   }
		   
		   
	   }
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   	   
	   
	}
	

}
