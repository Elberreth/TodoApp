package se.lexicon.Data.Impl;


import java.util.Optional;

public interface BaseDao<T, Person> {

        T create(T t);

        Optional<T> find(Person id);
    }
