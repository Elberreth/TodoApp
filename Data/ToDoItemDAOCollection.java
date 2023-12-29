package se.lexicon.Data;


import se.lexicon.Data.Impl.ToDoItemDAOImpl;
import se.lexicon.model.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import java.util.stream.Collectors;

public class ToDoItemDAOCollection implements ToDoItemDAOImpl {


    ArrayList<ToDoItem> list = new ArrayList<>();
    @Override
    public ToDoItem persist(ToDoItem todoItem) {
        if(todoItem == null) return null;
        list.add(todoItem);
        return todoItem;
    }
    @Override
    public ToDoItem findById(int id) {
        for (ToDoItem item: list) {
            if(item.getId() == id) return item;
        }
        return  null;
    }
    @Override
    public Collection<ToDoItem> findAll() {
        return list;
    }
    public Collection<ToDoItem> findAllByDoneStatus(boolean status) {
        // Filter items based on done status
        return list.stream()
                .filter(item -> item.isDone() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByTitleContains(String title) {
        // Filter items based on title containing the specified string
        return list.stream()
                .filter(item -> item.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByPersonId(int id) {
        // Filter items based on person id
        return list.stream()
                .filter(item -> item.getCreator() != null && item.getCreator().getId() == id)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByDeadlineAfter(LocalDate after) {
        // Filter items based on deadline after the specified date
        return list.stream()
                .filter(item -> item.getDeadLine() != null && item.getDeadLine().isAfter(after))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByDeadlineBefore(LocalDate before) {
        // Filter items based on deadline before the specified date
        return list.stream()
                .filter(item -> item.getDeadLine() != null && item.getDeadLine().isBefore(before))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        // Remove an item with the specified id from the list
        list.removeIf(item -> item.getId() == id);
    }
}