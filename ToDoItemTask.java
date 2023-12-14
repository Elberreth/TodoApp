package se.lexicon;

public class ToDoItemTask {



        static int taskObject;
        private int id;
        private boolean assigned;
        private ToDoItem todoItem;
        private Person assignee;

        public ToDoItem getTodoItem(){return todoItem;}
        public int getId() {return id;}
        public Person getAssignee() {return assignee;}
        public boolean isAssigned() {return assigned;}

        public void setAssigned(boolean assigned) {this.assigned = assigned;}
        public void setTodoItem(ToDoItem todoItem) {
            if(todoItem == null) throw new IllegalArgumentException("todo item was null");
            this.todoItem = todoItem;}
        public void setAssignee(Person assignee) {
            if (assignee == null) throw new IllegalArgumentException("assignee was null");
            this.assignee = assignee;
            setAssigned(true);}

        public ToDoItemTask(ToDoItem todoItem, Person assignee) {
        setAssignee(assignee);
        setTodoItem(todoItem);
        setAssigned(true);
        id = createUniqueId();
    }
        public String getSummary() {
            return "id: " + getId() + "\n" +
                    "Task info: " + getTodoItem().getTitle() + "\n" +
                    "Assigned Person " + getAssignee().getFirstName() + " " + getAssignee().getLastName();
        }
        public static int createUniqueId(){
            int uniqueId = taskObject;
            taskObject++;
            return uniqueId;
        }
    }

