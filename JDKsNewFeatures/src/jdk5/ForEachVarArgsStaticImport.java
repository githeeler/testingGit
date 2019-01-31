package jdk5;

import java.util.*;  //regular import
import static java.lang.System.*; //static import

public class ForEachVarArgsStaticImport {

	//Class shows 3 new features of jdk 5 :
	
	// 1) static import
	
	// 2) foreach loop
	
	// 3) vary arguments in method
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ale", "dupa", "jachu");  //call to static method in class
		
		for(String el: list)										//forEach
		{
			methodWithVarArgs(el, " !");							//vary arguments where you can use  >= 1 arguments
		}
		methodWithVarArgs("finito");
	}
	
	
	public static void methodWithVarArgs(String... strings )
	{
		out.println(Arrays.toString(strings)) ;  //call to static member variable from static import
	}

}
