package com.exception;

public class DemoEx {

    static int i=0;

    // Method to print numbers
    public static int printNumber(int x)
    {
  
        i = i + 2;
        System.out.println(i);
        if(i==10)
        	return i;
        return i + printNumber(i + 2);
    }
  
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // Recursive call without any
        // terminating condition
        DemoEx.printNumber(i);
    }
}
