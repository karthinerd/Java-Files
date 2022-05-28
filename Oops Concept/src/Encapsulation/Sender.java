/**
 * 
 */
package Encapsulation;

import java.util.Scanner;

public class Sender {

	public static void main(String[] args) {
	String Username;
	int Securitycode;
 Receiver Sender = new Receiver();
 Scanner Receiver = new Scanner(System.in);
	Username=Receiver.next();
	Securitycode=Receiver.nextInt();
	Sender.set(Username, Securitycode);
	Sender.get();
	}

}
