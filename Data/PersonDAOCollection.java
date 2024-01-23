package se.lexicon.Data;

import se.lexicon.Data.Impl.PersonDAOImpl;
import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import se.lexicon.util.StringHelper;


public class PersonDAOCollection implements PersonDAOImpl  {

    private ArrayList<Person> people = new ArrayList<>();


    @Override
    public Person persist(Person person) {
        if(person == null) return null;
        this.people.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : this.people) {
            if(person.getId() == id) return person;
        }
        return null;
    }

    /*@Override
    public Person findByEmail(String email) {
        if(StringHelper.isNullOrEmpty(email)) return null;
        for (Person person : this.people) {
            if(person.getEmail() == email) return person;
        }
        return null;
    }*/

    @Override
    public Collection<Person> findAll() {
        return people;
    }

    @Override
    public void remove(int id) {
        Person toRemove = null;
        for (Person person : this.people) {
            if(Objects.equals(person.getId(), id)) toRemove = person;
        }
        if(toRemove != null) people.remove(toRemove);
    }
}



