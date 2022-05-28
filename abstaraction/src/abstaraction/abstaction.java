package abstaraction;
abstract class Android11{
	public abstract void camera();
	public void iconSize() {
		System.out.println("password protection");
	}
}
class Android12 extends Android11{
	public void camera() {
		System.out.println("password protection");
	}
}


public class abstaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android12 obj = new Android12();
		obj.camera();

	}

}
