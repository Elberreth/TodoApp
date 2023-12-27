package se.lexicon;


import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItemTask;
import se.lexicon.util.AppRole;
import se.lexicon.util.SequencerEnum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
                Person august = new Person("August", "Brusbäck", "aggebrusback@gmail.com");
                Person daniel = new Person("Daniel", "Carlsson", "hej123@gmail.com");
                ToDoItem item = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), august);
                ToDoItem item1 = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), daniel);
                ToDoItemTask itemTask = new ToDoItemTask(item, august);
                ToDoItemTask itemTask2 = new ToDoItemTask(item1, daniel);

                AppUser user = new AppUser("August", "Hej", AppRole.ROLE_APP_ADMIN);
                AppUser user1 = new AppUser("daniel", "qwerty", AppRole.ROLE_APP_USER);

                System.out.println(august);

            }
        }

