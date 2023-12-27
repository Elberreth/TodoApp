package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class ToDoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //getters
    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getTaskDescription(){ return description;}
    public LocalDate getDeadLine(){return deadLine;}
    public Person getCreator(){return creator;}
    public boolean isOverdue(){ return deadLine.isAfter(LocalDate.now()); }
    public boolean isDone(){return done;}

    //setters
    public void setTaskDescription (String description) {
        if (description == null) throw new IllegalArgumentException("description was null");
        this.description = description;
    }
    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title was null");
        this.title = title;
    }
    public void setDeadLine(LocalDate deadLine) {
        if(deadLine == null ||deadLine.isAfter(LocalDate.now())) throw new IllegalArgumentException("DeadLine was null or has passed");
        else this.deadLine = deadLine;
    }
    public void setCreator(Person creator) {
        if (creator == null) throw new IllegalArgumentException("creator was null");
        this.creator = creator;
    }
    public void setDone(boolean done) {this.done = done;}
    public void setId(int id) {
        this.id = id;
    }

    public ToDoItem(String title, String description, LocalDate deadLine, Person creator, int id) {
        setDone(false);
        setTaskDescription(description);
        setCreator(creator);
        setTitle(title);
        setDeadLine(deadLine);
        setId(id);
    }
    @Override
    public String toString() {
        return
                "Id:" + getId() + "\n" +
                        "Title='" + getTitle() + "\n" +
                        "Description='" + getTaskDescription() + "\n" +
                        "DeadLine=" + getDeadLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return id == toDoItem.id && Objects.equals(title, toDoItem.title) && Objects.equals(description, toDoItem.description) && Objects.equals(deadLine, toDoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadLine);
    }


}