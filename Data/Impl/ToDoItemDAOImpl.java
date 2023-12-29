package se.lexicon.Data.Impl;
import se.lexicon.model.ToDoItem;
import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAOImpl {
    public ToDoItem persist(ToDoItem todoItem);
    public ToDoItem findById(int id);
    public Collection<ToDoItem> findAll();
    public Collection<ToDoItem> findAllByDoneStatus(boolean status);
    public Collection<ToDoItem> findByTitleContains(String title);
    public Collection<ToDoItem> findByPersonId(int id);
    public Collection<ToDoItem> findByDeadlineAfter(LocalDate after);
    public Collection<ToDoItem> findByDeadlineBefore(LocalDate before);
    public void remove(int id);

}

