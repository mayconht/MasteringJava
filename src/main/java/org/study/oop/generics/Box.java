package org.study.oop.generics;

public class Box<T> {
//    the class can extend another class and implement interfaces which will limit the types of T
    
    private T content;

    public void put(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
