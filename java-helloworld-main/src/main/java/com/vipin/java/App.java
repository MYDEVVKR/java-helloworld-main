package com.vipin.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public List includeClasses = new ArrayList();

    public static void main( String[] args )
    {
        String password = "this is my password";
        System.out.println( "Password is!= " + password);
        System.out.println( "Hello World!" );
        throw new ArithmeticException("/ by zero");
    }


}
