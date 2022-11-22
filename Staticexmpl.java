package com.task1;

public class Staticexmpl 
{
final static int a;
void meth1()
{
	System.out.println("meth1() called");
//a=50;  C.E
}
static void meth2()
{
	System.out.println("meth2() called");
	//a=50;   C.E
}
static
{
	System.out.println("1st static block executed");
	new Staticexmpl().meth1();
}
Staticexmpl()
{
	System.out.println("Hi");
}
public static void main(String[] args)
{
System.out.println("main() executed:"+a);	
}
static
{
	a=50;
	System.out.println("2nd static block executed");
	meth2();
}
}
