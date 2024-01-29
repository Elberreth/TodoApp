package se.lexicon.Data.Impl;

import se.lexicon.model.Person;

import java.util.Collection;

public interface PersonDAOImpl {
    Person create (Person person);

    Person findById(int id);

    //Person findByEmail(String email);

   Collection<Person> findAll();

    void remove(int id);

    Person update (Person person);
    boolean deleteById (int id);
}
