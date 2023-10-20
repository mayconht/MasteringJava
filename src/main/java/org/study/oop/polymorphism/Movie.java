package org.study.oop.polymorphism;

public class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    public Movie() {
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().trim()) {
            case "ADVENTURE" -> new AdventureMovie(title);
            case "DRAMA" -> new DramaMovie(title);
            case "COMEDY" -> new ComedyMovie(title);
            default -> new Movie(title);
        };
    }

    public void watchMovie() {
        System.out.println("Watching movie " + title);
        String instanceType = this.getClass().getSimpleName();
        System.out.println("title is: " + this.title + ".\nIt is a " + instanceType + " movie");
    }
}

