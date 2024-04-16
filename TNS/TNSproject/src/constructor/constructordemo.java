package constructor;

import java.util.Scanner;

public class constructordemo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		String name,city;
		int id;
		System.out.println("Enter customer id");
		id=s.nextInt();
		
		s.nextLine();
		System.out.println("Enter customer name");
		name=s.nextLine();
		
		System.out.println("Enter customer city");
		city=s.nextLine();
		
		System.out.println(" ");
		
		customer c1=new customer(); //default cunstructor invoked
		
		c1.setCustomerid(id);
		c1.setCustomername(name);
		c1.setCustomercity(city);
		
		System.out.println(c1);
		
//		System.out.println(c1.getCustomercity());
//		System.out.println(c1.getCustomerid());
//		System.out.println(c1.getCustomerName());
		
		customer c2=new customer("Aditya",101,"Mumbai");
		System.out.println(c2);
		
	}

}