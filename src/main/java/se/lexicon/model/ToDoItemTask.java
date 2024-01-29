package se.lexicon.model;

import se.lexicon.util.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class ToDoItemTask {


        private int id;
        private boolean assigned;
        private ToDoItem todoItem;
        private Person assignee;

        //getters
        public ToDoItem getTodoItem(){return todoItem;}
        public int getId() {return id;}
        public Person getAssignee() {return assignee;}
        public boolean isAssigned() {return assigned;}

    //setters
    public void setAssigned(boolean assigned) {this.assigned = assigned;}
    public void setTodoItem(ToDoItem todoItem) {
            if(todoItem == null) throw new IllegalArgumentException("todo item was null");
            this.todoItem = todoItem;}
    public void setAssignee(Person assignee) {
            if (assignee == null) throw new IllegalArgumentException("assignee was null");
            this.assignee = assignee;
            setAssigned(true);}


    private void setId(int id){this.id = id;}

        public ToDoItemTask(ToDoItem todoItem, Person assignee, int id) {
        setAssignee(assignee);
        setTodoItem(todoItem);
        setAssigned(true);
        setId(id);
    }
    @Override
    public String toString() {
        return
                "id:" + getId() + "\n" +
                "To do:" + getTodoItem();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItemTask that = (ToDoItemTask) o;
        return id == that.id && assigned == that.assigned && Objects.equals(todoItem, that.todoItem) && Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTodoItem());
    }
    }

