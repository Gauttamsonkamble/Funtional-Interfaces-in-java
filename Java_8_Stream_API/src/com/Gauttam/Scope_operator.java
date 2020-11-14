package com.Gauttam;

import java.util.Arrays;
import java.util.List;

public class Scope_operator 
{
	public static void main(String args[])
	{
		List<Integer> values = Arrays.asList(1,3,4,5,6);
		
		values.forEach(System.out::println);
		values.forEach(Scope_operator::doubleit);
	}
	
	public static  void doubleit(int i)
	{
		System.out.println("\n"+i*2);
	}

}
