package jdk7;

public class MultipleExceptionsAndNumericLiteralsUnderscores {

	
	public static void main(String[] args) {
		
		
		//Sample showing catching multiple exceptions in one catch 
		try {
			myThrow(""); 			//comment this line
			myThrow("What abou that");
		} catch (MyException | RuntimeException e) {
			
			System.out.println("handled any exception by my own: " + e.getMessage());
		}

		System.out.println("-----------------------------Underscorces in numeric literals (divide digits in groups for better readability) ------------------------------");
		
		int i = 0b001100;
		int i_und = 0b00_11_00;		//Underscores can be placed only between digits
		
		System.out.println("The i =" + i);
		System.out.println("The underscored i =" + i_und);
		
		long hexadecimalBytes = 0xFF_EC_DE_5E;
		long hexadecimalWords = 0xCAFE_BABE;
		
		System.out.println("hexadecimalBytes="+hexadecimalBytes);
		System.out.println("hexadecimalWords="+hexadecimalWords);
	}

	public static void myThrow(String msg) throws MyException {

		if (msg == null || msg.isEmpty())
			throw new IllegalStateException("Nooope");

		System.out.println(msg);
		
		throw new MyException("End of stupid method!");
	}

}

class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}

}
