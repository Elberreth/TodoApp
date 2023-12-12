package se.lexicon;

import java.time.LocalDate;
public class ToDoItem {

       static int taskCreated;
        private int id;
        private String title;
        private String description;
        private LocalDate deadLine;
        private boolean done;
        private Person creator;

        public ToDoItem(String title, String description, LocalDate deadLine, Person creator) {
            setTaskDescription(description);
            setCreator(creator);
            setTitle(title);
            setDeadLine(deadLine);
            id = createUniqueId();
        }
        public Person getCreator() {return creator;}
        public int getId() {return id;}
        public String getTitle() {return title;}
        public LocalDate getDeadLine() {return deadLine;}
        public String getTaskDescription() {return description;}

        public void setTaskDescription (String description) {
            if (description == null) throw new IllegalArgumentException("description was null");
            this.description = description;
        }

        //public void setId(int id) {this.id = id;}

        public void setTitle(String title) {
            if (title == null) throw new IllegalArgumentException("title was null");
            this.title = title;
        }

        public void setDeadLine(LocalDate deadLine) {
            if(deadLine == null ||deadLine.isAfter(LocalDate.now())) throw new IllegalArgumentException("DeadLine was null or has passed");
            else this.deadLine = deadLine;
        }

        public void setCreator(Person creator) {
            if (creator == null) throw new IllegalArgumentException("creator was null");
            this.creator = creator;
        }

        public void setDone(boolean done) {this.done = done;}

        public boolean isDone() {return done;}
        public boolean isOverdue() {return deadLine.isAfter(LocalDate.now());}
        public String getSummary () {
            return "id: " + getId() + "\n" +
                    "Title: " + getTitle() + "\n" +
                    "Description " + getTaskDescription() + "\n" +
                    "Deadline " + getDeadLine() + "\n" +
                    "Creator " + getCreator().getFirstName() + " " + getCreator().getLastName();
        }

        public static int createUniqueId () {
            int uniqueId = taskCreated;
            taskCreated++;
            return uniqueId;
        }
    }

