package enacpsulation;

import java.util.Scanner;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email,password;
		student object = new student();
		Scanner student = new Scanner(System.in);
		email=student.next();
		password=student.next();
		object.set(email,password);
		object.get();
	}

}
