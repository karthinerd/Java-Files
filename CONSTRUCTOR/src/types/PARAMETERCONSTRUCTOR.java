package types;

import java.util.Scanner;

public class PARAMETERCONSTRUCTOR {
   private int password;
   PARAMETERCONSTRUCTOR(int password){
	   System.out.println("Enter YOur Password");
	   Scanner input = new Scanner(System.in);
	   this.password=input.nextInt();
	  if(this.password==password) {
	   System.out.println("Password Correct");
   }
        else {
	   System.out.println("Check Your Password");
         }
   }
	public static void main(String[] args) {
		PARAMETERCONSTRUCTOR r =new PARAMETERCONSTRUCTOR(1998);
		
	}

}
