/**
 * 
 */
package stringmethod;

public class string {

	public static void main(String[] args) {
		String name = "Karthi";
		String Name = "Kumar";
		char a=name.charAt(3);
		System.out.println(a);
		int b=name.codePointAt(0);
		int c=name.codePointBefore(4);
		System.out.println(b);
		System.out.println(b);
		System.out.println(c);
		int d=Name.codePointCount(0, 5);
		System.out.println(d);
		System.out.println(name.compareTo(Name));
		System.out.println(name.compareToIgnoreCase(Name));
		System.out.println(name.concat(Name));
		System.out.println(name.contains(Name));
		System.out.println(name.contentEquals(Name));
		System.out.println(name.endsWith("i"));
		System.out.println(Name.startsWith("r"));
		System.out.println(name.indexOf("r"));
		System.out.println(name.equals(Name));
		System.out.println(name.isEmpty());
		System.out.println(name.length());
		System.out.println(name.replace("i", "ck"));
		System.out.println(name.replaceAll(name, "raj"));
		System.out.println(name.replaceFirst(name,"k"));
	}

}
