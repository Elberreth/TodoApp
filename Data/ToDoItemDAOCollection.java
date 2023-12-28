package se.lexicon.Data;

import se.lexicon.Data.Impl.BaseDao;
import se.lexicon.Data.Impl.ToDoItemDAOImpl;
import se.lexicon.model.ToDoItemTask;

import java.util.Optional;

public class ToDoItemDAOCollection implements BaseDao<ToDoItemTask, Integer> {


    @Override
    public ToDoItemTask create(ToDoItemTask toDoItemTask) {
        return null;
    }

    @Override
    public Optional<ToDoItemTask> find(Integer id) {
        return Optional.empty();
    }
}
