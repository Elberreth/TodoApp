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
        Person August = new Person("August", "Klas", "aggebrusback@gmail.com", Sequencer.getNextId(SequencerEnum.PERSON),new AppUser("August", "qwerty123", AppRole.ROLE_APP_ADMIN));
        ToDoItem Item = new ToDoItem("Chores", "Do the dishes", LocalDate.now(),August,Sequencer.getNextId(SequencerEnum.TODOITEM));
        ToDoItemTask itemTask = new ToDoItemTask(Item, August, Sequencer.getNextId(SequencerEnum.TODOITEMTASK));
        AppUser user = new AppUser("August", "qwerty", AppRole.ROLE_APP_ADMIN);

        Person Daniel = new Person("Daniel", "Carlsson", "Hej123@gmail.com", Sequencer.getNextId(SequencerEnum.PERSON),new AppUser("Daniel", "hej123", AppRole.ROLE_APP_USER));
        ToDoItem Item1 = new ToDoItem("Chores", "Do the dishes", LocalDate.now(),Daniel,Sequencer.getNextId(SequencerEnum.TODOITEM));
        ToDoItemTask itemTask1 = new ToDoItemTask(Item1, Daniel, Sequencer.getNextId(SequencerEnum.TODOITEMTASK));
        AppUser user1 = new AppUser("Daniel", "qwerty", AppRole.ROLE_APP_USER);

        System.out.println(user);
        System.out.println("-------");
        System.out.println(itemTask1);
        System.out.println("-------");
        System.out.println(Daniel);
        System.out.println("-------");
        System.out.println(user1);
        System.out.println("-------");
        System.out.println(itemTask);
        System.out.println("-------");
        System.out.println(August);
    }
}

