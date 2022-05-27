/**
 * 
 */
package accessModifier;

/**
 * @author karth
 *
 */
public class AccessModifier {
	
	public int hours =12;
	
	protected int minutes=55;

    private int a=2;
    
    static int b=6;
    
    public static void main(String[] args) {
    	
     b=7;
     
     System.out.println(b);
     
    }
}
