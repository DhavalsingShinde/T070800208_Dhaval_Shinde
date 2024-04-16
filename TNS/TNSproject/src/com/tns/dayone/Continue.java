package com.tns.dayone;

public class Continue {
	public static void main(String [] args)
	{
		for(int i=5; i<15; i++)
		{
			//odd no are skip
			if(i%2 !=0)
				continue;
			System.out.println(i+" ");
		}
	}

}
