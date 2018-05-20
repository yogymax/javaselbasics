package com.scp.sel.eleven.basics;


/*
 * Method area -- 
 * 		collegeName=null
 * 		m2()
 * 		main()
 * 		constructor()
 * 
 * 
 * Heap
 * 		st1
 * 			id=0
 * 			nm=null
 * 			m1()
 * 		st2
 * 			id=0
 * 			nm=null
 * 			m1()
 * 		
 * 
 * S - I = ORR
 * S -S = Direct
 * I - I = direct
 * I - S = Direct
 * 
 * 
 * 
 * 
 */

public class Student {
	int id;
	String studName;
	static String collegeName;
	
	{
	 System.out.println("instance block");	
	}
	
	static{
		System.out.println("static block");
	}
	
	public void m1(){
		System.out.println("instance method");
		System.out.println(id);
		System.out.println(studName);
		System.out.println(collegeName);
	}
	
	
	public static void m2(){
		System.out.println("static method");
	}
	
	
	Student(){
		System.out.println("constructor");
		System.out.println(id);
		System.out.println(studName);
		System.out.println(collegeName);
		
	}

	
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		System.out.println(st1.id);
		System.out.println(st1.studName);
		System.out.println(collegeName);
		//s - i ORR
		
		
		
		
		
	}
	
	
}
