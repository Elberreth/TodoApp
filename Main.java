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

                AppUser user = new AppUser("August", "Hej", AppRole.ROLE_APP_ADMIN);
                AppUser user1 = new AppUser("daniel", "qwerty", AppRole.ROLE_APP_USER);
                AppUser user2 = new AppUser("Kent", "aaaaa", AppRole.ROLE_APP_ADMIN);
        System.out.println(user);
                System.out.println(itemTask);
        System.out.println("\n");
                System.out.println(user1);

                System.out.println(itemTask2);
        System.out.println("\n");
                System.out.println(user2);
        System.out.println(item1);

            }
        }

