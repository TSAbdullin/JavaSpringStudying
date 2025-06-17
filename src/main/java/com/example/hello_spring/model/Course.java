package com.example.hello_spring.model;

public class Course {
    private static long idCounter = 1;

    private long id;
    private String title;
    private String description;

    public Course() { this.id = idCounter++;}

    public Course(String title, String description) {
        this.id = idCounter++;
        this.description = description;
        this.title = title;
    }

    //Геттеры и сеттеры

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
