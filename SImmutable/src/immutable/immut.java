/**
 * 
 */
package immutable;

/**
 * @author karth
 *
 */
public class immut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = new String("Karthi");
		String b="Karthi";
		String c ="Karthi";
		System.out.println(b==c);
		System.out.println(a==b);
		kumar(a,60);
	//	System.out.println(kumar(a,60));
	}
	public static void kumar(String name,int amount) {
		name=name.replace('K', 'k');
		System.out.println(name);
		
	}

}
