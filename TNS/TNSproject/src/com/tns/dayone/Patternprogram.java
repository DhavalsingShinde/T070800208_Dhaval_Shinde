package com.tns.dayone; 
import java.util.*;

public class Patternprogram {
	
	

	
				public static void printPattern(int n)
		{
			int i, j;
			
			for (i = 0; i < n; i++) {
					
					if (i == 0 || i == 0 || i == n - 1
						|| i == n - 1)
					{
						System.out.print("*");
					}
					
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		

		
		public static void main(String args[])
		{
			int n = 6;
			printPattern(n);
		
	}


}
