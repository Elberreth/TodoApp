package se.lexicon.model;

import se.lexicon.util.StringHelper;

public class Person {

    private int person_id;
    private String first_Name;
    private String last_Name;









    public void setFirst_Name(String first_Name) {
        if (StringHelper.isNullOrEmpty(first_Name)) throw new IllegalArgumentException("First name was null");
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        if (StringHelper.isNullOrEmpty(last_Name)) throw new IllegalArgumentException("Lastname was null");
        this.last_Name = last_Name;
    }

    private void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    //Getters

    public  String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public int getPerson_id() {
        return person_id;
    }

//Constructor
   /* public Person(String first_Name, String last_Name, int person_id) {
        setFirst_Name(first_Name);
        setLast_Name(last_Name);
        setPerson_id(person_id);
*/


    public Person(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                '}';
    }

    public Person(int person_id, String first_Name, String last_Name) {
        this.person_id = person_id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;






    }
}