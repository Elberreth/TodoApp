package se.lexicon.Data;


import se.lexicon.Data.Impl.BaseDao;



import java.util.Objects;
import java.util.Optional;


import se.lexicon.model.Person;

public class AppUserDAOCollection implements BaseDao<Person,Integer> {

    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Optional<Person> find(Integer id) {
        return Optional.empty();
    }
}



