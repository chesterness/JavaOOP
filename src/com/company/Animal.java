package com.company;

public interface Animal {
    public void sound();//function signature it's a function without body
    static void staticMethod(){
        System.out.println("This is static method");
    }
    default void defaultMethod(){
        System.out.println("This is default method");
    }
    //interface methods cannot have bodies unless they're static or default
    //you can implement more than one interface
    //interface with only one function is called 'functional interface'
    //there are also interfaces without any function these interfaces are called 'marker interfaces'

}
