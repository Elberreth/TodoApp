package se.lexicon;

import se.lexicon.Data.PersonDAOCollection;
import se.lexicon.util.Connector;
import se.lexicon.model.Person;
import se.lexicon.util.MySQLConnection;
public class Main {
    public static void main(String[] args)  {



        Connector.set_url("jdbc:mysql://localhost:3306/todoit");
        Connector.set_password("root");
        Connector.set_username("root");
        Connector.getConnection();

        //PersonDAOCollection PersonDAO = new PersonDAOCollection();
       // Person person = PersonDAOCollection.findByID(2).get();




    }
}










