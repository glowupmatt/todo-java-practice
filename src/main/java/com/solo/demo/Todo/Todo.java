package com.solo.demo.Todo;

public class Todo {
    private int id;
    private String task;
    private String description;
    private boolean isCompleted;

    
    public Todo(int id, String task, String description, boolean isCompleted) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.isCompleted = isCompleted;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", task=" + task + ", description=" + description + ", isCompleted=" + isCompleted
                + "]";
    }

    
}
