// this class holds the information required for a teacher such as variables, constructors to create a teacher
// and setters and getters to get the field and set it to the variable
public class Teacher {
    // creating variables for teacher fields
    String firstName;
    String lastName;
    String subject;

    Teacher(String firstName, String lastName, String subject){ // creating contructor for teacher with fields
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    Teacher(){          //Default teacher
        firstName = "Michael";
        lastName = "Smith";
        subject = "math";
    }

    //setter and getters for teacher's fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

