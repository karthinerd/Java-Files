package methodtutorial;

import java.util.Scanner;

public class construct {
	private static int pin;
	
	construct(){
		System.out.println("Enter your password");
		Scanner input = new Scanner(System.in);
		pin = input.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construct object = new construct();
		if(pin==2002) {
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login not Successful");
		}

	}

}
