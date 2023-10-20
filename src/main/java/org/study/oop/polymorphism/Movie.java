package org.study.oop.polymorphism;

public class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    public Movie() {

    }

    public void watchMovie() {
        System.out.println("Watching movie " + title);
        String instanceType = this.getClass().getSimpleName();
        System.out.println("title is: " + this.title + ".\nIt is a " + instanceType + " movie");
    }
}

