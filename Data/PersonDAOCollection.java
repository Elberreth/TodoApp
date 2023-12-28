package se.lexicon.Data;

import se.lexicon.Data.Impl.BaseDao;

import se.lexicon.model.Person;

import java.util.*;



public  class PersonDAOCollection implements BaseDao<Person, String > {


    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Optional<Person> find(String id) {
        return Optional.empty();
    }
}

