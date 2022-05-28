class AndroidOne{
	public void password() {
		System.out.println("password security ver 1");
	}
}
class AndroidTwo extends AndroidOne{
	public void camera() {
		System.out.println("camera ver 2");
	}
}
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidTwo obj = new AndroidTwo();
		obj.password();
		obj.camera();
   
	}

}
