package se.lexicon.Data.Impl;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItem;
import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAO {
    ToDoItem create(ToDoItem todoItem);

    ToDoItem findById(int id);

    Collection<ToDoItem> findAll();

    Collection<ToDoItem> findByDoneStatus(boolean status);

    Collection<ToDoItem> findByAssignee(int id);

    Collection<ToDoItem> findByAssignee(Person id);

    Collection<ToDoItem> findByUnassignedToDoItems();

    ToDoItem update(ToDoItem toDoItem);
    void deleteById(int id);
}
