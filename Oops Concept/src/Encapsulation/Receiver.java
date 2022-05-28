/**
 * 
 */
package Encapsulation;

public class Receiver {
	private String Username;
	private int Securitycode;
 public void get() {
	 System.out.println(Username);
	 System.out.println(Securitycode);
 }
	public void set(String Username,int Securitycode) {
		if(Securitycode<9999) {
			this.Securitycode=Securitycode;
		}
		else
		{
			System.out.println("SC must be 4 letters");
		}
		this.Username=Username;
		
	}

}
