package com.exception;

public class SingletonObject {
	int a;
	private SingletonObject(int a)
{
		this.a=10;
		System.out.println(a);
	System.out.println(" private constructor called");
	}
	 public static SingletonObject getObject() {
	      // we can call this constructor
	      if (ref == null)
	         ref = new SingletonObject(20);
	      return ref;
	   }
	   private static SingletonObject ref;

}

