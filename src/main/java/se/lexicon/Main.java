package se.lexicon;

import se.lexicon.Data.PersonDAOCollection;
import se.lexicon.util.Connector;
import se.lexicon.model.Person;

public class Main {
    public static void main(String[] args)  {



        Connector.set_url("jdbc:mysql://localhost:3306/todoit");
        Connector.set_password("root");
        Connector.set_username("root");
        Connector.getConnection();

       Person daniel = new Person("Daniel", "Carlsson");
        System.out.println(daniel.getFirst_Name());
        PersonDAOCollection  personDAO = new PersonDAOCollection();
        personDAO.create(daniel);
        personDAO.create(new Person("August", "Brusbäck"));





    }
}










