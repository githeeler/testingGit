package jdk5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//example showing annotations in java
public class Annotations {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	
		//Call of depricated method
		C c = new C();
		c.m();
		
		System.out.println("-------------------------");
		
		
		//getting usage of my custom annotation
		
		Annotations instance = new Annotations();
		
		Method method = instance.getClass().getMethod("calculateBusiness");
		
		MetaData annotation = method.getAnnotation(MetaData.class);
		
		System.out.println("calculateBusiness method was created by "+annotation.project() + " with ranking: "+ annotation.ranking());
	}
	
	
	@MetaData(project="Energy (important)", ranking=100)
	public void calculateBusiness()
	{
		System.out.println("Very intense calculations!!");
	}

	
}

class C{
	
	@Deprecated
	void m() { System.out.println("I say m!");};
	
}

class D extends C{
	
	//@Override		// uncomment - compile time error( the is no method to overriden in super class) 
	void M() { System.out.println("I say M!");} 
}







//Annotations for annotation declaration (these annotations have @Target(ElementType.ANNOTATION_TYPE))
@Retention(RetentionPolicy.RUNTIME)  							//will be seen all time (during runtime and also on compilation and class levels)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR}) 			//can be used for methods and constructors
@Inherited 														//will be inherited by subclasses
@interface MetaData{		
	
	String project();  
	
	int ranking() default 1;  //each method can have default value
	
	//Date year(); Don't compile: methods in annotation can return one of the following: primitive data types, String, Class, enum or array of these data types.
	
}