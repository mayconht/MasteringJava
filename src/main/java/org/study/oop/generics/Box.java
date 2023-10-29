package org.study.oop.generics;

public class Box<T> {
    private T content;

    public void put(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
