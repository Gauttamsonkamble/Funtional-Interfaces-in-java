package com.Gauttam;

import java.util.Arrays;
import java.util.List;

public class Stream_API_1 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
//		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
//		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		
		System.out.println(values.stream().filter(i->i%2==0).reduce(0,(c,e)->c+e));

	}

}
