package exceptionHandling;

public class TCFTT {

	public static void main(String[] args) throws Exception  {
		int a,b,c;
		
		try {
			a=10;
			b=0;
			c=a/b;
		}
		catch (Exception e) {
			throw new ArithmeticException("Can't Divide a by 0");
		}
		finally {
			System.out.println("Finished");
		}
	}

}
