package se.lexicon.model;

import java.time.LocalDate;

import se.lexicon.util.StringHelper;


public class ToDoItem {
    public static ToDoItem create;
    private int todo_id;
    private String title;
    private String description;
    private LocalDate deadline;
    private int assigneeId;
    private boolean done;

    // Constructors, getters, and setters
    public ToDoItem(String title, String description, LocalDate deadline,boolean done,int assigneeId) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.assigneeId = assigneeId;

    }
    public int getTodo_id() {
        return todo_id;
    }

    public void setTodo_id(int todo_id) {
        this.todo_id = todo_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        if (StringHelper.isNullOrEmpty(title)) throw new IllegalArgumentException("title was null");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (StringHelper.isNullOrEmpty(description)) throw new IllegalArgumentException("description was null");
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(int assigneeId) {
        this.assigneeId = assigneeId;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "ToDoItem{" +
                ", todoId=" + todo_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", assigneeId=" + assigneeId +
                ", done=" + done +
                '}';
    }
}
