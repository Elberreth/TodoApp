package se.lexicon;


import se.lexicon.Sequencer.Sequencer;
import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItemTask;
import se.lexicon.util.AppRole;
import se.lexicon.util.SequencerEnum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
                Person august = new Person("August", "Brusbäck", "aggebrusback@gmail.com", Sequencer.getNextId(SequencerEnum.PERSON));
                Person daniel = new Person("Daniel", "Carlsson", "hej123@gmail.com",2);
                ToDoItem item = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), august,1);
                ToDoItem item1 = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), daniel,2);
                ToDoItemTask itemTask = new ToDoItemTask(item, august,1);
                ToDoItemTask itemTask2 = new ToDoItemTask(item1, daniel, 2);

                AppUser user = new AppUser("August", "Hej", AppRole.ROLE_APP_ADMIN);
                AppUser user1 = new AppUser("daniel", "qwerty", AppRole.ROLE_APP_USER);

                System.out.println(user);

            }
        }

