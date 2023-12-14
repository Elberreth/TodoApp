package se.lexicon;


import java.time.LocalDate;

import static se.lexicon.ToDoItem.createUniqueId;

public class Main {
    public static void main(String[] args) {









                Person august = new Person("August", "Brusbäck", "aggebrusback@gmail.com");
                Person daniel = new Person("Daniel", "Carlsson", "hej123@gmail.com");
                ToDoItem item = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), august);
                ToDoItem item1 = new ToDoItem("Chores", "Do the dishes", LocalDate.now(), daniel);
                ToDoItemTask itemTask = new ToDoItemTask(item, august);
                ToDoItemTask itemTask2 = new ToDoItemTask(item1, daniel);


               /* System.out.println(item.getSummary());
                System.out.println(august.getSummary());
                System.out.println(item1.getSummary());
                System.out.println(daniel.getSummary());
                System.out.println(itemTask.getSummary());
                System.out.println(itemTask2.getSummary());*/
            }
        }

