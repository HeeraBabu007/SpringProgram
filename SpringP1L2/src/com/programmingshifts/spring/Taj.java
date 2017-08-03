package com.programmingshifts.spring;

public class Taj 
{
	String SundayFood;
	
	public String getSundayFood() 
	{
		return SundayFood;
	}

	public void setSundayFood(String sundayFood) 
	{
		SundayFood = sundayFood;
	}

	public void SayHello()
	{
		System.out.println("Welcome to Taj Hotel...");
		System.out.println(this.getSundayFood());
	}

}
