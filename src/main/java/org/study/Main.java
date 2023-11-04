package org.study;

import org.study.basics.*;
import org.study.oop.Pojo;
import org.study.oop.StaticEx;
import org.study.oop.abstraction.Cat;
import org.study.oop.abstraction.Snake;
import org.study.oop.classes.Classes;
import org.study.oop.classes.composition.ComputerCase;
import org.study.oop.classes.composition.Monitor;
import org.study.oop.classes.composition.Motherboard;
import org.study.oop.classes.composition.PersonalComputer;
import org.study.oop.classes.inheritance.Animal;
import org.study.oop.classes.inheritance.Dog;
import org.study.oop.classes.inheritance.Fish;
import org.study.oop.classes.polymorphism.AdventureMovie;
import org.study.oop.classes.polymorphism.ComedyMovie;
import org.study.oop.classes.polymorphism.Movie;
import org.study.oop.generics.Box;

public class Main {
    public static void main(String[] args) {
        System.out.println("to better understand the code, please read the comments in the source files");
        System.out.println("To run the code and understand it, please run on debug mode");
        {
            System.out.println("basics");
            new Operator();
            new Types();
            new Methods();
            new ControlFlow();
            new Arrays();
            new Arrays().insideArrays();
        }
        {
            System.out.println("oop");
            {
                System.out.println("Classes");
//                A class is a blueprint for the object.
                new Classes();
                StaticEx.method1();
                StaticEx.method("test");

                System.out.println("StaticEx.a = " + StaticEx.a);
                StaticEx ex1 = new StaticEx(5);
                StaticEx ex2 = new StaticEx(15);
                System.out.println("ex1.a = " + ex1.a);
                System.out.println("ex2.a = " + ex2.a);
            }
            {
                System.out.println("Pojo");
//                POJO stands for Plain Old Java Object. Usually is similar to database table.
                Pojo po = new Pojo(1, 2);
                po.setX(5);
                System.out.println("po.getX() = " + po.getX());
                System.out.println("po.getY() = " + po.getY());
            }
            {
                System.out.println("Inheritance");
//                Inheritance is a mechanism in which one class acquires the property of another class.
//                For example, a child inherits the traits of his/her parents.
                Dog dog = new Dog("German Sheppard", "big", "16");
                Animal animal = new Animal("animal", "big", "10");
                Fish fish = new Fish("clown fish", "small", "1");
                dog.bark();
                dog.move("6km/h");
                animal.move("10km/h");
                fish.move("2km/h");
                animal.makeNoise();
                fish.eat();
            }
            {
                System.out.println("Composition");
/*
                Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
                It represents part-of relationship.
*/
                Monitor monitor = new Monitor("27inch", "Samsung", "30cm", "60cm", "4k", "60Hz");
                Motherboard motherboard = new Motherboard("Z390", "Asus", "30cm", "30cm", "LGA1151", "Z390");
                ComputerCase computerCase = new ComputerCase("Corsair X black", "Corsair", "60cm", "30cm", "1100w", "black");
                PersonalComputer pc = new PersonalComputer("PersonalBuilt", "Client", "60cm", "30cm", monitor, motherboard, computerCase);
                pc.turnOn();
                pc.turnOff();
            }
            {
                System.out.println("Polymorphism");
//                Polymorphism is the ability of an object to take on many forms.
//                The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
                Movie movie = Movie.getMovie("Comedy", "hangover");
                movie.watchMovie();
                movie = Movie.getMovie("Drama", "Titanic");
                movie.watchMovie();
                movie = Movie.getMovie("Adventure", "Jumanji");
                movie.watchMovie();

//                extra - Casting in Java
//                Casting is used when one class type needs to be converted into another class type.
//                Casting is of two types − Widening Casting (Implicit) and Narrowing Casting (Explicit).
//                Widening Casting (Implicit)
//                Widening casting is done automatically when passing a smaller size type to a larger size type:
                int myInt = 9;
                double myDouble = myInt; // Automatic casting: int to double
                System.out.println("myInt = " + myInt);
                System.out.println("myDouble = " + myDouble);
//                Narrowing Casting (Explicit)
//                Narrowing casting must be done manually by placing the type in parentheses in front of the value:
                double myDouble2 = 9.78;
                int myInt2 = (int) myDouble2; // Manual casting: double to int
                System.out.println("myDouble2 = " + myDouble2);
                System.out.println("myInt2 = " + myInt2);

//                for class casting, please see the following example:

                AdventureMovie adventureMovie = (AdventureMovie) Movie.getMovie("Adventure", "Jumanji");
                adventureMovie.watchMovie();
                Object comedyMovie = Movie.getMovie("Comedy", "hangover");
//                System.out.println("comedyMovie = " + comedyMovie.watchMovie()); // this will not work because Object does not have watchMovie method
                ((ComedyMovie) comedyMovie).watchMovie(); // this will work because we cast the object to ComedyMovie
                var movie2 = Movie.getMovie("Adventure", "jaws"); // this is the same as Movie movie2 = Movie.getMovie("Comedy", "hangover");
//               The var keyword was introduced in Java 10, and it is a reserved type name.
//               It is used to declare a variable whose type is inferred by the compiler.
                movie2.watchMovie();
            }
            {
                System.out.println("Abstraction");
                System.out.println("Interface");
//                An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//                To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends).
                var myCat = new Cat();
                myCat.makeSound();
                myCat.move();

                System.out.println("Abstract class");
//                An abstract class can have both abstract and regular methods:
//                Note: Unlike interfaces, abstract classes can have a constructor.
//                Note: If a class is declared abstract, it cannot be instantiated (create objects) and any methods declared abstract must be implemented by the subclass.
                var mySnake = new Snake();
                mySnake.makeSound();
                mySnake.move();
            }
            {
                System.out.println("Generics");
//                Generics are a facility of generic programming that were added to the Java programming language in 2004 within version J2SE 5.0.
//                They were designed to extend Java's type system to allow "a type or method to operate on objects of various types while providing compile-time type safety".
//                A generic type is a generic class or interface that is parameterized over types.
//                The following Box class will be modified to demonstrate the concept of generics.
                Box<String> stringBox = new Box<>();
                Box<Integer> integerBox = new Box<>();
                stringBox.put("test");
                integerBox.put(10);

                System.out.println("stringBox.get() = " + stringBox.get());
                System.out.println("integerBox.get() = " + integerBox.get());


            }
        }
    }
}