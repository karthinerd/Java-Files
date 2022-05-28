package exceptionHandling;

public class tryCatch {

	public static void main(String[] args) throws  ArithmeticException{
		// TODO Auto-generated method stub
		int a=100;
		try {
			a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			throw new ArithmeticException("Dont divide a number by zero");
		}
		finally {
			System.out.println("thanks for the time");
		}

	}

}
