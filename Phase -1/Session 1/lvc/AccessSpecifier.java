package com.simplilearn.lvc;

public class AccessSpecifier {
	protected void display()
	{
		System.out.println("You are accessing protected specifier");
	}
	
	private void test()
	{
		System.out.println("My Private Method");
	}
	
	public void hello()
	{
		System.out.println("Public Method");
	}
	
	void world()
	{
		System.out.println("Default Method");
	}

}
