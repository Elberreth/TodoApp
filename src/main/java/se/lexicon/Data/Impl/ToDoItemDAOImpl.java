package se.lexicon.Data.Impl;
import se.lexicon.model.ToDo_Item;
import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAOImpl {
    public ToDo_Item persist(ToDo_Item todoItem);
    public ToDo_Item findById(int id);
    public Collection<ToDo_Item> findAll();
    public Collection<ToDo_Item> findAllByDoneStatus(boolean status);
    public Collection<ToDo_Item> findByTitleContains(String title);
    public Collection<ToDo_Item> findByPersonId(int id);
    public Collection<ToDo_Item> findByDeadlineAfter(LocalDate after);
    public Collection<ToDo_Item> findByDeadlineBefore(LocalDate before);
    public void remove(int id);

}

