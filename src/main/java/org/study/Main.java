package org.study;

import org.study.basics.ControlFlow;
import org.study.basics.Methods;
import org.study.basics.Operator;
import org.study.basics.Types;
import org.study.oop.Classes;
import org.study.oop.Pojo;
import org.study.oop.StaticEx;
import org.study.oop.composition.ComputerCase;
import org.study.oop.composition.Monitor;
import org.study.oop.composition.Motherboard;
import org.study.oop.composition.PersonalComputer;
import org.study.oop.inheritance.Animal;
import org.study.oop.inheritance.Dog;
import org.study.oop.inheritance.Fish;
import org.study.oop.polymorphism.AdventureMovie;
import org.study.oop.polymorphism.ComedyMovie;
import org.study.oop.polymorphism.DramaMovie;
import org.study.oop.polymorphism.Movie;

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
//                Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
//                It represents part-of relationship.
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
                Movie movie = new Movie("Interstellar");
                movie.watchMovie();
                Movie adventureMovie = new AdventureMovie("Indiana Jones");
                adventureMovie.watchMovie();
                Movie comedyMovie = new ComedyMovie("The Hangover");
                comedyMovie.watchMovie();
                Movie dramaMovie = new DramaMovie("The Godfather");
                dramaMovie.watchMovie();
            }
        }
    }
}