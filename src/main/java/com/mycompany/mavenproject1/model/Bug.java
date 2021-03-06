package com.mycompany.mavenproject1.model;

import java.util.UUID;
public class Bug {
    
    private String id;
    private String title;
    private int age;
    private Priority priority;

    public Bug() {
        genenerateRandomID();
    }

    public Bug(String title, int age, Priority priority) {
        genenerateRandomID();
        
        this.title = title;
        this.age = age;
        this.priority = priority;
    }

    public Bug(String id, String title, int age, Priority priority) {
        this.id = id;
        this.title = title;
        this.age = age;
        this.priority = priority;
    }
    
    private void genenerateRandomID() {
        id = UUID.randomUUID().toString();
    }

    public boolean isCritical() {
        return priority == Priority.CRITICAL;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    public Priority getPriority() {
        return priority;
    }

}
