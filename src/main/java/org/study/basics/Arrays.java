package org.study.basics;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public Arrays() {
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // To declare an array, define the variable type with square brackets:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // We have now declared a variable that holds an array of strings. To read from the array, refer to the index number:
        System.out.println(cars[0]);
        // Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Array Length
        System.out.println(cars.length);
        // Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }
        // Multidimensional Arrays
        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7}
        };
        int x = myNumbers[1][2];
        System.out.println(x);
        // Loop Through a Multidimensional Array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        // Loop Through a Multidimensional Array with For-Each
        for (int[] i : myNumbers) {
            for (int j : i) {
                System.out.println(j);
            }
        }

    }

    public void insideArrays() {
        var simpleArray = new int[10];
        // when you create an array, you have to specify the size of the array, that way the compiler knows how much memory to allocate for the array
        // you can also initialize the array with values like this:
        var initializedArray = new int[]{1, 2, 3, 4, 5};
        // you can also create a multidimensional array like this:
        var multiDimensionalArray = new int[10][10];
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(true);
        list.add(1.0);
        /*
        The difference in performance between an array and a list is that an array is a fixed size, so it is faster to access an element in an array than it is to access an element in a list.
        A list is a dynamic data structure, so it is slower to access an element in a list than it is to access an element in an array.
        A dinamic List is a list that can grow and shrink in size, but on background it has to create a new array and copy the elements from the old array to the new array.
        in terms of performance, it is faster to access an element in an array than it is to access an element in a list.
        that is why you should specify the size of the array when you create it, so that the compiler knows how much memory to allocate for the array and the performance is better.
         */

    }

}
