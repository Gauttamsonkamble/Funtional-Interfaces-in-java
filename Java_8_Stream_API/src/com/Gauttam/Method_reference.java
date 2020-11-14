package com.Gauttam;

import java.util.Arrays;
import java.util.List;

public class Method_reference {
	public static void main(String args[]) 
	{
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

//		values.forEach(System.out::println);
		values.forEach(Method_reference::doubleit);
	}
	
	public static void doubleit(int i)
	{
		System.out.println(i*2);
	}

}
