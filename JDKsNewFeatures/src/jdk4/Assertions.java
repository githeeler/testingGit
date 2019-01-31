package jdk4;

public class Assertions {

	//The important feature of J2SE 4 is assertions. It is used for testing.
	//To run the -ea or -enableassertions switch of java must be used.
	
	
	//When the system runs the assertion, it evaluates expression and if it is false throws an AssertionError with no detail message.
	//Do not use assertions for argument checking in public methods (IllegalArgumentException is for this)
	//In testing use better org.junit.Assert.*
	
	public static void main(String[] args) {
		
		//someMethod(null);
		
		//someMethod(15);
		
		someMethod(21);
	}
	
	public static void someMethod(Integer age){
		
		assert age != null; //first form: if false, JVM will throw an  AssertionError.
		
		assert age >= 18 : "Not valid age"; //second form: if false, JVM will throw an named AssertionError.
		
		System.out.println("I'm adult, my age is: " + age);
		
	}
}
