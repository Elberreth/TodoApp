package se.lexicon.model;

import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    //Setters
    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email was null");
        this.email = email;
    }
    public void setCredentials(AppUser credentials) {
        if (credentials == null) throw new IllegalArgumentException("Credentials was null");
        this.credentials = credentials;
    }
    public void setFirstname (String firstName){
        if (firstName == null) throw new IllegalArgumentException("First name was null");
        this.firstName =firstName;
    }
    public void setLastName (String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Lastname was null");
        this.lastName =lastName;
    }
    private void setId (int id){this.id = id;}

    //Getters
    public AppUser getCredentials() {return credentials;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    //Constructor
    public Person (String firstName, String lastName, String email){
        setFirstname(firstName);
        setLastName(lastName);
        setEmail(email);
        setId(id);
    }

    public Person (String firstName, String lastName, String email, AppUser credentials) {
        this(firstName, lastName, email, id);
        setCredentials(credentials);
    }

    @Override
    public String toString() {
        return  "id:" + getId() + "\n" +
                "Name:" + getFirstName() + " " + getLastName() + "\n" +
                "Email:" + getEmail();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}