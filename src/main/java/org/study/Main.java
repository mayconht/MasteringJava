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
                Pojo po = new Pojo(1, 2);
                po.setX(5);
                System.out.println("po.getX() = " + po.getX());
                System.out.println("po.getY() = " + po.getY());
            }
            {
                System.out.println("Inheritance");
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
                Monitor monitor = new Monitor("27inch", "Samsung", "30cm", "60cm", "4k", "60Hz");
                Motherboard motherboard = new Motherboard("Z390", "Asus", "30cm", "30cm", "LGA1151", "Z390");
                ComputerCase computerCase = new ComputerCase("Corsair X black", "Corsair", "60cm", "30cm", "1100w", "black");
                PersonalComputer pc = new PersonalComputer("PersonalBuilt", "Client", "60cm", "30cm", monitor, motherboard, computerCase);
                pc.turnOn();
                pc.turnOff();
            }
        }
    }
}