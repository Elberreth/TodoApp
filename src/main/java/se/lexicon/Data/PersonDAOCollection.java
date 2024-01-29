package se.lexicon.Data;

import se.lexicon.Data.Impl.PersonDAOImpl;
import se.lexicon.model.Person;
import se.lexicon.util.Connector;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.sql.*;


public class PersonDAOCollection implements PersonDAOImpl  {



    List <Person> persons = new ArrayList<>();







    @Override

                public Person create(Person person) {

            String insertQuery = "INSERT INTO person (first_name, last_name) VALUES (?,?)";

            try (

                Connection connection = Connector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS)
        ) {

            preparedStatement.setString(1, person.getFirst_Name());
            preparedStatement.setString(2, person.getLast_Name());


            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Person created successfully!");
            }


            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int generatedPersonId = generatedKeys.getInt(1);
                    System.out.println("generatedPersonId = " + generatedPersonId);
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

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

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
