package org.study.oop.polymorphism;

public class ComedyMovie extends Movie {
    public ComedyMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Sounds of people laughing" +
                " and funny scenes are playing");
    }
}
