package com.mycompany.part2.section2;

public class MainEntry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		MyGenInterface<Integer, String> mg1 = new MyGenClass<Integer, String>(1, "Robert Freeman");
		MyGenInterface<Integer, Integer> mg2 = new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("Key: " + mg1.getKey() + " Value: " + mg1.getValue());
		System.out.println("Key: " + mg2.getKey() + " Value: " + mg2.getValue());
		
		System.out.println("Integer 1: " + i1 + " Float 1: " + f1);
		
		
	}

}
