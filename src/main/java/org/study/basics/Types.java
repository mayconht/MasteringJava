package org.study.basics;

public class Types {
    public Types() {
        System.out.println("Types called");
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Character: " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("Boolean: " + Boolean.TRUE + " or " + Boolean.FALSE);
        System.out.println("String: " + "String is not a primitive type, but it is immutable");
        int x[] = {1, 2, 3, 4, 5};
        System.out.println("Array has " + x.length + " elements");
        System.out.println("Array at position 0: " + x[0]);

    }
}
