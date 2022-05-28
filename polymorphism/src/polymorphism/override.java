package polymorphism;
class C{
	public void iconDesign() {
		System.out.println("Square icon");
	}
}
class D extends C{
	public void iconDesign() {
		System.out.println("Round icon");
	}
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.iconDesign();

	}

}
