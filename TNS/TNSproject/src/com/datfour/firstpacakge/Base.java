package com.datfour.firstpacakge;

public class Base {
	//declare public,private,protected,private vairable
	
	int vardefault=10;
	public int varpublic=20;
	protected int varprotected=30;
	private int varprivate=40;
	
	//declare default,public,protected,private methods
	
	void methoddefault()
	{
	
	System.out.println("default access base class");
	System.out.println("default vairables"+varpublic);
	
	}
	void methodpublic()
	{
	
	System.out.println("public access base class");
	System.out.println("public vairables"+varpublic);
	
	}
	public void methodprivate()
	{
	
	System.out.println("private access base class");
	System.out.println("private vairables"+varprivate);
	
	}
	public void methodprotected()
	{
	
	System.out.println("protected access base class");
	System.out.println("protected vairables"+varprotected);
	
	}
	 
	

}
