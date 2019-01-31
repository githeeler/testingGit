package jdk5;

public class CovariantReturnType {
	
	
	//Example showing return type overriding, in methods by subclasses
	//It is  called covariant return type
	
	public static void main(String[] args) {
		
		System.out.println("And teh winner is?: "  + new B().getInstance().getMsg());
	}
	

}

class A {
	
	A getInstance()
	{
		return this;
	}
	
	String getMsg(){ return "It is A"; }
}			
			

class B extends A{

// not needed
//	A getInstance()
//	{
//		return this;
//	}
	
	String getMsg(){ return "It is B"; }
	
}
