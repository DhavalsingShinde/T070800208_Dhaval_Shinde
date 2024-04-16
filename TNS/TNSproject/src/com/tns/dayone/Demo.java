package com.tns.dayone;

public class Demo {
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		int x=30;
		
		System.out.println("a and b value before the opertaions :"+ a +" "+ b);
		//increment ++
		//decrement --
		
		++a;
		int c=(++a)+(--a)+(--a)+ a++;
		
		System.out.println("c value after the operation:" + c);
		
		int d= c++ + a +b--;
		System.out.println("d value after the operation:" + d);


		
		}

}
