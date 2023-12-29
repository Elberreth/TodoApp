package se.lexicon.Data.Impl;
import se.lexicon.model.Person;

import java.util.Collection;
import java.util.List;

public interface PersonDAOImpl {
    Person persist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

   Collection<Person> findAll();

    void remove(int id);
}
