package jdk7;

public class StringInSwitchStatementAndBinaryLiterals {

	
	//example showing usage of Strings in switch and Binary Literals  
	
	public static void main(String[] arngs) {
		
		
		//Switch expression can be byte, short, char, and int primitive data types.
		//Beginning JDK5 it also works with Enums
		//Beginning with JDK7 it also works with Strings
		String value = "JaroPietalo";
		
		switch(value) 
		{
		case "jaroPietalo":							//comparison is case sensitive!
			System.out.println( "I'm small jaro");
		break;
		
		case "JaroPietalo":
			System.out.println( "I'm adult JARO");
		break;
		
		default:
			System.out.println("Some other dude");
		
		}
		
		System.out.println("//-----------------------------------Binary literals-----------------------------");
		//The integral types (byte, short, int, and long) can also be expressed using the binary number system.
		//We need to prefix the number with 0b or 0B. 
		
		//8bit value
		byte abyte = 0b00110000;
		System.out.println(" byte value=: "+ abyte);
		
		//short int 
		short aShort = 0b00110000;
		System.out.println(" Short value=: "+ aShort);
		
		long aLong= 0b00110000L;
		System.out.println(" Long value=: "+ aLong); 
		

	}

}
