interface A {
	public void camera();     //unimplemented / method declaration
	public void iconSize();
}
interface B{
	public void password();
}
class Ba implements A,B{
	public void camera() {        ///method implementation
		System.out.println("Camera working");
	}
	public void password() {
		System.out.println("password protection");
	}
	public void iconSize() {
		/// create later
	}
}

public class interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ba object = new Ba();
		object.camera();
		object.password();

	}

}
