package com.Gauttam;

import java.util.Arrays;
import java.util.List;

public class Funtional_Interface {
	
	public static void main(String args[])
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
//		for(int i : values)
//		{
//			System.out.println(i);
//		}
		
		values.forEach(i->System.out.println(i));
		
		
	}

}
