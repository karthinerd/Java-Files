/**
 * 
 */
package atmproject;

import java.util.Scanner;

/**
 * @author karth
 *
 */
public class atmprogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c,i,balance=50000,withdraw = 0;
		String name="karthigairaj";
		 System.out.println("Enter Your pin :");
		 Scanner input = new Scanner (System.in);
		 a=input.nextInt();
	   if(a<999)
	     {
		   for(i=0;i<=1;i++)
			 {
      	 System.out.println("Your pin was wrong");
      	 System.out.println("Enter a valid pin");
      	a=input.nextInt();
		 }
	   System.out.println("You Reached a day limit");
		 }
	     if(a<=9999&&a>999)
	     {
	    		     
        System.out.println("Welcome" + " " +name);
        System.out.println(" Your pin is correct");
      
	     for(i=0;i<=2;i++)
	     {
	    	 System.out.println("Enter 1 for Balance");
	    	 System.out.println("Enter 2 for Withdraw");
	    	 System.out.println("Enter 3 for Current Balance"); 
       b=input.nextInt();
       switch (b)
       {
      
    	   case 1 :
    		   System.out.println("Your Balance is :" + balance);
    		   break;
    	   case 2 :
    		   System.out.println("Enter Your Withdraw amount :");
    		   withdraw=input.nextInt();
    		   System.out.println("Your Withdraw is Done");
    		   break;
    	   case 3:   
    			  c=balance- withdraw;
    			  System.out.println(" Your Current Amount is :" + c);
    			  break;
    		default :
    			 System.out.println("Enter Valid Key within 3 times:");
    			  
       }
       
	}
	     System.out.println("Time Out");
	     
	     }
	     System.out.println("Thanks For Coming");
}}
