class AndroidOne1{
	public void password() {
		System.out.println("password security ver 1");
	}
}
class AndroidTwo2 extends AndroidOne1{
	public void camera() {
		System.out.println("camera ver 2");
	}
}
class AndroidThree extends AndroidTwo2{
	public void Cache() {
		System.out.println("update Cache Speed");
	}
}
public class multilevel {
	public static void main(String[] args) {
		AndroidThree obj=new AndroidThree();
		obj.Cache();
		obj.camera();
		obj.password();
	}

}
