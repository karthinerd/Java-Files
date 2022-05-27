package string;

public class test {

	public static void main(String[] args) {
		int i;
long startTime=System.currentTimeMillis()	;	
StringBuffer a = new StringBuffer("Karthi");
System.out.println(a);
System.out.println(a.charAt(4));
System.out.println(a.indexOf("K"));
System.out.println(a.length());
System.out.println(a.append("gairaj"));
System.out.println(a.substring(2,4));

for (i=0;i<=6;i++)
{
	System.out.println("RKR");
}
long endTime=System.currentTimeMillis()	;
System.out.println(endTime-startTime);

long startTime1=System.currentTimeMillis()	;	
StringBuilder b = new StringBuilder("Karthi");
System.out.println(b);
System.out.println(b.charAt(4));
System.out.println(b.indexOf("k"));
System.out.println(b.length());
System.out.println(b.append("gairaj"));
for (i=0;i<=6;i++)
{
	System.out.println("RKR");
}
long endTime2=System.currentTimeMillis()	;
System.out.println(endTime-startTime);

	}

}
