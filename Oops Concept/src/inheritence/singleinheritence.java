
package inheritence;
class laptop {
	public void os() {
		System.out.println("OS-Operating System");
	}
}

public class singleinheritence extends laptop{
  public void power() {
	  System.out.println("updating Power to the OS");
  }

	public static void main(String[] args) {
		singleinheritence pc = new singleinheritence();
        pc.os();
        pc.power();
	}

}
