package org.study;

import org.study.basics.ControlFlow;
import org.study.basics.Methods;
import org.study.basics.Operator;
import org.study.basics.Types;
import org.study.oop.Classes;
import org.study.oop.StaticEx;

public class Main {
    public static void main(String[] args) {
        System.out.println("to better understand the code, please read the comments in the source files");
        System.out.println("To run the code and understand it, please run on debug mode");
        new Operator();
        new Types();
        new Methods();
        new ControlFlow();
        new Classes();
        StaticEx.method1();
        StaticEx.method("test");
        System.out.println("StaticEx.a = " + StaticEx.a);
        StaticEx ex1 = new StaticEx(5);
        StaticEx ex2 = new StaticEx(15);
        System.out.println("ex1.a = " + ex1.a);
        System.out.println("ex2.a = " + ex2.a);


    }
}
