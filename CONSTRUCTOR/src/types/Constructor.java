/**
 * 
 */
package types;

import java.util.Scanner;

public class Constructor {
	public static int id;
	Constructor(){
		System.out.println("Enter Your id");
		Scanner input = new Scanner(System.in);
		id=input.nextInt();
		if(id==2002) {
			System.out.println("ID Right");
		}
		else {
			System.out.println("Not Right");
		}
	}

	public static void main(String[] args) {
		Constructor a =new Constructor();
		
	}

}
