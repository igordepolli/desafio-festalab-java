package com.mycompany.mavenproject1.model;

import java.time.LocalDate;
import java.util.UUID;

public class Bug {
    
    private String id;
    private String title;
    private LocalDate date;
    private Priority priority;

    public Bug() {
        genenerateRandomID();
    }

    public Bug(String title, LocalDate date, Priority priority) {
        genenerateRandomID();
        
        this.title = title;
        this.date = date;
        this.priority = priority;
    }

    public Bug(String id, String title, LocalDate date, Priority priority) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.priority = priority;
    }
    
    private void genenerateRandomID() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public Priority getPriority() {
        return priority;
    }

}
