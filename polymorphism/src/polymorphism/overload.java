package polymorphism;
class A{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		System.out.println(a-b-c);
	}
}
public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.add(3, 3,4);
		obj.add(2, 0);

	}

}
