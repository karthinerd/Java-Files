/**
 * 
 */
package karthi;
class kumar extends Thread{
	@Override
	public void run() {
		System.out.println("hello");
		super.run();
	}
}

public class thread implements Runnable{
	@Override
	public void run() {
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {
	thread a= new thread();
	Thread b = new Thread(a);
	b.start();
	kumar c =new kumar();
	c.start();
	}

}
