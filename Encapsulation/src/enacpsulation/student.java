package enacpsulation;
public class student {
	private String email;
	private String password;
	
	public void get()
	{
		System.out.println(email);
		System.out.println(password);
	}
	public void set(String email,String password) {
		this.email = email;
		this.password = password;
	}

}
