package org.study.oop;

public class Classes {
    public Classes() {
        System.out.println("Classes called");
        Example ex = new Example();
        ex.method1();
        ex.method1("test");
        ex.printValues();
        Example ex2 = new Example(1, 2);
        ex2.printValues();

    }
}

class Example {

    int x;
    int y;

    public Example(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("example class called in constructor with parameters");
    }

    public Example() {
        System.out.println("example class called in default constructor");
    }

    public void method1() {
        System.out.println("method1 called ");
    }

    public void method1(String str) {
        System.out.println("method1 overload called with string: " + str);
    }

    public void printValues() {
        System.out.println("x= " + x + " y= " + y);
    }


}

