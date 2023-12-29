package se.lexicon.Data.Impl;

import se.lexicon.model.ToDoItemTask;
import java.util.Collection;
import java.util.ArrayList;

public interface ToDoItemTaskDAOImpl {
    public ToDoItemTask persist (ToDoItemTask toDoItemTask);
    public ToDoItemTask findById(int id);
    public Collection<ToDoItemTask> findAll();
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status);
    public Collection<ToDoItemTask> findByPersonId(int id);
    public void remove(int id);
}

