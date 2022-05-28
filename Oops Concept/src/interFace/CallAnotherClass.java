/**
 * 
 */
package interFace;

/**
 * @author karth
 *
 */
public class CallAnotherClass extends School {
	public void SectionA() {
		System.out.println("Tamil");
	}
	public void SectionB() {
		System.out.println("English");
	}
	public static void main(String[] args) {
		CallAnotherClass a= new CallAnotherClass();
		a.SectionA();
		a.SectionB();
	}

}
