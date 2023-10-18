package org.study.basics;

public class Methods {
    public Methods() {
//        methods
        method1();
        method2();
//        Modifiers:
        System.out.println("Modifiers: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html");
        System.out.println("public - The code is accessible for all classes");
        System.out.println("private - The code is only accessible within the declared class");
        System.out.println("protected - The code is accessible in the same package and subclasses");
        System.out.println("static - The code is a class method");
        System.out.println("final - The code is a constant");

//        method Overload:
        method1("test");
        method2("test");
    }

    public void method1() {
        System.out.println("method1 called");
    }

    public void method1(String str) {
        System.out.println("method1 overload called with string: " + str);
    }

    public void method2() {
        System.out.println("method2 called");
    }

    public void method2(String str) {
        System.out.println("method2 overload called with string: " + str);
    }
}
