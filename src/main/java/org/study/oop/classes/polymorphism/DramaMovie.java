package org.study.oop.classes.polymorphism;

public class DramaMovie extends Movie {
    public DramaMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("A sad music is playing" +
                " and sad scenes are playing");
    }
}
