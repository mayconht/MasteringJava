package org.study.oop.polymorphism;

public class AdventureMovie extends Movie {
    public AdventureMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Adventure Music is playing" +
                " and sound effects are playing");
    }
}
