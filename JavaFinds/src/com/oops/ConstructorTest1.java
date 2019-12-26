package com.oops;



//public class A{}	:	Will throw an error.
 class A
{
	A()
	{
		System.out.println("Hello A");
	}
}
 
 /* RULES:
  * Each source file should contain only one public class and the name of that public class should be similar to the name of the source file.
 If you are declaring a main method in your source file then main should lie in that public class.
  * */
 class B extends A
{
	 B()
		{
			System.out.println("Hello B");
		}
}
 class C extends A
{
	 C()
		{
			System.out.println("Hello C");
		}
}

public class ConstructorTest1 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
	}

}
