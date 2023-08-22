// this class holds the information required for a student such as variables, constructors to create a student
// and setters and getters to get the field and set it to the variable
public class Student {

    // creating variables for firstname, lastname, grade, and number id
    String firstName;
    String lastName;
    String grade;
    int studentNumber;
    static int numID = 1000; // default num id


    Student(){      //default student
        firstName = "John";
        lastName = "Doe";
        grade = "A";
        studentNumber = numID;
        numID++;

    }


    Student(String firstName, String lastName, String grade) { // student constructor with fields
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = numID;
        numID++;
    }


    // setters and getters for student fields
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}