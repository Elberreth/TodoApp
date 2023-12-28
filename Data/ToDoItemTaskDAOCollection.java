package se.lexicon.Data;

import se.lexicon.Data.Impl.BaseDao;
import se.lexicon.Data.Impl.ToDoItemTaskDAOImpl;
import se.lexicon.model.Person;

import java.util.Optional;

public class ToDoItemTaskDAOCollection implements BaseDao<Person,Integer> {

    @Override
    public Person create(Person person) {
        return null;
    }

    public Optional<Person> find(Integer id) {
        return Optional.empty();
    }
}
