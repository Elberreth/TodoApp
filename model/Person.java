package se.lexicon.model;

import se.lexicon.util.StringHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import se.lexicon.model.MySQLConnection;

public class Person {

    private int person_id;
    private String first_Name;
    private String last_Name;



    public void setFirst_Name (String first_Name){
        if (StringHelper.isNullOrEmpty(first_Name)) throw new IllegalArgumentException("First name was null");
        this.first_Name =first_Name;
    }
    public void setLast_Name (String last_Name) {
        if (StringHelper.isNullOrEmpty(last_Name)) throw new IllegalArgumentException("Lastname was null");
        this.last_Name =last_Name;
    }
    private void setId (int id){this.person_id = id;}

    //Getters

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }
    public int getId() {
        return person_id;
    }


    //Constructor
    /*public Person(String first_Name, String last_Name, int id) throws SQLException {
        setFirstname(first_Name);
        setLastName(last_Name);
        setId(id);
*/


    public Person(int person_id, String first_Name, String last_Name ) throws SQLException {
        this.person_id = person_id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;




        Person person = new Person(person_id, "Testsson", "Test" );
        String insertQueryPerson = "INSERT INTO students (first_name, last_name) VALUES(?,?)";
        String insertQueryPersonRelationship = "INSERT INTO person_id (person_id) VALUES(?)";

        Connection connection = MySQLConnection.getConnection();

        try (
                PreparedStatement preparedStatement = connection.prepareStatement(insertQueryPerson, PreparedStatement.RETURN_GENERATED_KEYS);
        )
         {

            connection.setAutoCommit(false);

            //Prepares the Query with Data to insert into DB
            preparedStatement.setString(1, person.getFirst_Name());
            preparedStatement.setString(2, person.getLast_Name());
             preparedStatementForPerson.setInt(3, generatedPersonId);

            //Execute Insert - Return number of rows affected.
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student created successfully!");
            } else {
                System.out.println("Rollback Student Insert");
                connection.rollback();
                throw new RuntimeException("Insert Operation in (student) table failed!");
            }
            int generatedStudentId = 0;
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    generatedStudentId = generatedKeys.getInt(1);
                    System.out.println("generatedStudentId = " + generatedStudentId);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }}}}