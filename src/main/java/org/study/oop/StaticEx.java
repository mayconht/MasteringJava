package org.study.oop;

public class StaticEx {
    // static examples are used for utility methods, like Math.random()
    // static variables, even if you have multiple instances of the class, there is only one copy of the static variable

    public static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public StaticEx(int a) {
        StaticEx.a = a;
    }
//    the static block in a non-static class is executed when the class is instantiated
//    but the static block in a static class is executed when the class is loaded

    //static method
    public static void method1() {
        System.out.println("Static method called.");
    }

    public static void method(String str) {
        System.out.println("Static method called with string: " + str);
    }
    // static examples are used for utility methods, like Math.random()
    // static methods can only call other static methods and access static data
    // static methods cannot use this or super keywords
    // static methods cannot be overridden
    // static methods cannot be abstract
}
