package se.lexicon.Data;

import se.lexicon.Data.Impl.PersonDAOImpl;
import se.lexicon.model.Person;
import se.lexicon.model.ToDo_Item;
import se.lexicon.util.Connector;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class PersonDAOCollection implements PersonDAOImpl  {

    private final ArrayList<Person> people = new ArrayList<>();
    Person person = new Person("Test", "Testsson");
    String insertQuery = "INSERT INTO person (first_name, last_name(?,?)";


    public Person save(Person item) {
        Person savedItem = null;
        String insertItem = "insert into Person(first_name,last_name),?,?)";

        try (Connection connection = Connector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertItem, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, Person.getfirst_Name());
            preparedStatement.setString(2, Person.getlast_Name());

            int rowsAdded = preparedStatement.executeUpdate();
            if (rowsAdded > 0) {
                try (ResultSet generatedId = preparedStatement.getGeneratedKeys()) {
                    if (generatedId.next()) {
                        item.getPerson_id(generatedId.getInt(1));
                        savedItem = item;
                    }
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return savedItem;

    }

    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}