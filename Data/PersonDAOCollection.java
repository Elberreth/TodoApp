package se.lexicon.Data;

import se.lexicon.Data.Impl.PersonDAOImpl;
import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import se.lexicon.util.StringHelper;


public  class PersonDAOCollection implements PersonDAOImpl  {

    private ArrayList<Person> persons = new ArrayList<>();


    @Override
    public Person persist(Person person) {
        if(person == null) return null;
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person: persons) {
            if(person.getId() == id) return person;
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        if(StringHelper.isNullOrEmpty(email)) return null;
        for (Person person: persons) {
            if(person.getEmail() == email) return person;
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        Person toRemove = null;
        for (Person person: persons) {
            if(Objects.equals(person.getId(), id)) toRemove = person;
        }
        if(toRemove != null) persons.remove(toRemove);
    }
}



