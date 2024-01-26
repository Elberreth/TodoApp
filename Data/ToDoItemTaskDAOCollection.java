package se.lexicon.Data;


import se.lexicon.Data.Impl.ToDoItemTaskDAOImpl;
import se.lexicon.model.ToDoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ToDoItemTaskDAOCollection implements ToDoItemTaskDAOImpl {

    private ArrayList <ToDoItemTask> list = new ArrayList<>();
    @Override
    public ToDoItemTask persist(ToDoItemTask toDoItemTask) {
        if (toDoItemTask == null) return null;
        list.add(toDoItemTask);
        return toDoItemTask;
    }

    @Override
    public ToDoItemTask findById(int id) {
        return list.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<ToDoItemTask> findAll() {
        return list;
    }

    @Override
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status) {
        return list.stream()
                .filter(task -> task.isAssigned() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItemTask> findByPersonId(int id) {
        return list.stream()
                .filter(task -> task.getAssignee() != null && task.getAssignee().getPerson_id(2) == id)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        list.removeIf(task -> task.getId() == id);
    }
}

