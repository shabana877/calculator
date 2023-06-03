package com.ty.calc;


public class Calc {
	
	public static void addition(int a, int b)
	{
		System.out.println("The addition of a and b is " + a+b);
	}
	public static void multiple(int a, int b)
	{
		System.out.println("The multiple of a and b is " + a*b);
	}
	public static void division(int a, int b)
	{
		System.out.println("The division of a and b is " + a/b);
	}
	public static void subtract(int a, int b)
	{
		System.out.println("The subtraction of a and b is " + (a-b));
	}
	public static void main(String[] args) {
		Calc.addition(10, 7);
		Calc.multiple(2, 7);
		Calc.division(2, 10);
		Calc.subtract(2, 7);
	}
	
}
