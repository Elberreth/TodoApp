package se.lexicon.model;

import se.lexicon.util.StringHelper;

import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    //Setters
    public void setEmail(String email) {
        if (StringHelper.isNullOrEmpty(email)) throw new IllegalArgumentException("email was null");
        this.email = email;
    }
    public void setCredentials(AppUser credentials) {
        if (credentials == null) throw new IllegalArgumentException("Credentials was null");
        this.credentials = credentials;
    }
    public void setFirstname (String firstName){
        if (StringHelper.isNullOrEmpty(firstName)) throw new IllegalArgumentException("First name was null");
        this.firstName =firstName;
    }
    public void setLastName (String lastName) {
        if (StringHelper.isNullOrEmpty(lastName)) throw new IllegalArgumentException("Lastname was null");
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
    public Person (String firstName, String lastName, String email, int id, AppUser credentials){
        setFirstname(firstName);
        setLastName(lastName);
        setEmail(email);
        setId(id);
        setCredentials(credentials);
    }

    /*public Person(int id, String firstName, String lastName, String email, AppUser credentials) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credentials = credentials;
        setCredentials(credentials);

     */
    @Override
    public String toString() {
        return  "id:" + getId() + "\n" +
                "Name:" + getFirstName() + " " + getLastName() + "\n" +
                "Email:" + getEmail() + " " + "\n" +
                "Credentials:" + getCredentials();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email) && Objects.equals(credentials, person.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email,credentials);
    }
}




