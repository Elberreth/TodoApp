package se.lexicon.Data.Impl;
import se.lexicon.model.Person;
import java.util.List;

public interface PersonDAOImpl {
    List<Person> findAll();
}
