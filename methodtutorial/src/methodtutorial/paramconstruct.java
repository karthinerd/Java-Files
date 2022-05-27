package methodtutorial;

import java.util.Scanner;

public class paramconstruct {
	private static int pin;

	 paramconstruct(int pin) {
		System.out.println("Enter your password");
		Scanner input = new Scanner(System.in);
		this.pin = input.nextInt();
		if (this.pin == pin) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login not Successful");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramconstruct obj = new paramconstruct(2002);

	}

}
