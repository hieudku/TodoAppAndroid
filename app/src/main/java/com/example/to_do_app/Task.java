package com.example.to_do_app;

import com.google.firebase.Timestamp;

public class Task {
    // Fields
    private String id;
    private String title;
    private String description;
    private Timestamp dueDate;  // New field for due date

    // Default constructor for DataSnapshot.getValue(Task.class)
    public Task() {
    }

    // Parameterized Constructor
    public Task(String id, String title, String description, Timestamp dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;  // Initialize the due date
    }

    // Getters and Setters for task id, title, description, dueDate
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }
}
