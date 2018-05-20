package com.scp.sel.eleven.basics;


/**
 *
 * JDK JRE JVM
 * Java memory Model
 * Types of var
 * 		Instance var vs Static Var vs Local var
 * Types of methods
 * 		instance vs static method
 * 
 * you can write a code inside
 * 		instance block {}
 * 		static block   static{}
 * 		instance method   public void m1(){}
 * 		static method    static public void m1(){}
 * 		constructor  --special method -- which has same name as your class name
 * 				and no return type not even void
 * 	
 * if no access modifier given to var/method -- default will be there
 * 
 * Types of access modifiers
 * 		-- Public 
 * 		-- Protected
 * 		-- Default
 * 		-- Private
 * 	
 * 
 * Java prog execution life cycle --
 * 
 * what is class -- what is objet
 * 
 * rules for indentifiers
 * 		-- a-z A-Z 0-9 $ _
 * 		-- case sensitive
 * 		-- should not start with digit
 * 		-- should be <15 char
 * 		-- meaningful
 * 		
 * coding conventions
 * 		method name and variable name -- start with small letters + camelcase
 * 		class name  -- start with capital letters + camelcase
 * 		packagename	 -- all should be in small letters seperated by dots
 * 			start with more generic to more specific
 * 			reverse of site url
 * 			
 * 		constants -- all capital letters and seperate by underscope  final double PI_VALUE=3.14
 * 		
 * 
 * Datatypes
 * 
 * char  (Space) (2)
 * boolean (flase) (no size)
 * 
 * 	Numeric
 * 	  integral (0)
 * 		-- byte  (1)
 * 		-- Short (2)
 * 		-- int  (4)
 * 		-- long	 (8)
 * 	  floating (0.0)
 * 		 float (4)
 * 		 double (8)
 * 	
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * Method area
 * 		ProductVendor =null;
 * 		main();
 * 		m2();
 * 
 * started main method execution
 * 
 * Thread stack
 * 			
 * 			
 * 
 * 	-------------------
 * 			p1
 * 			main()
 * ---------------------
 * 
 * 
 * 
 * Heap
 * 
 *
 */

public class Product {
	int productId;
	String productName;
	static String productVendor;
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		p1.m1();
		p2.m1();
		m2();
		
	}
	
	
	public void m1(){
		int i=10;
	}
	
	static public void m2(){
		
	}
	

}
