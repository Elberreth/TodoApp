package se.lexicon;

public class Person {



        private static int personsCreated;
        private int id;
        private String firstName;
        private String lastName;
        private String email;


        public Person (String firstName, String lastName, String email){
            setFirstname(firstName);
            setLastName(lastName);
            setEmail(email);
            id = createUniqueId();
        }

        public void setFirstname (String firstName){
            if (firstName == null) throw new IllegalArgumentException("First name was null");
            this.firstName =firstName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setLastName (String lastName) {
            if (lastName == null) throw new IllegalArgumentException("Lastname was null");
            this.lastName =lastName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getId() {
            return id;
        }

        public static int createUniqueId(){
            int uniqueId = personsCreated;
            personsCreated++;
            return  uniqueId;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            if (email == null) throw new IllegalArgumentException("email was null");
            this.email = email;
        }
        public String getSummary(){
            return "{ " + getFirstName() + " " + getLastName() + ", email: " + getEmail() + ", id: " + getId() + " }";
        }
    }

