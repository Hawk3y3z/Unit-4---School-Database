// this class holds the arraylists for both teacher and student, the methods for updating and printing the array list for teacher and student,
// as well as creating the ability to communicate with other classes.
import java.util.ArrayList;

public class School {

        ArrayList<Teacher> teachers; // creating a new arraylist to hold teachers
        ArrayList<Student> students; // creating a new arraylist to hold students

        School(){
            students = new ArrayList<>(); // creating a new arraylist and calling it students
            teachers = new ArrayList<>(); // creating a new arraylist and calling it teachers
        }


        public void InitialStudents(){ // setting the initial student count and adding set amount of students to list
            int NumofStudents = 10; // setting the number of students to 10

            // adding default student to end of arraylist
            for(int i = 0; i<NumofStudents; i++){
                Student NewStudent = new Student();
                students.add(i,NewStudent);
            }

        }

        public void PrintStudents(){ // printing student list
            for(int i = 0; i<students.size(); i++){
                System.out.print("[Name]: " + students.get(i).getFirstName());
                System.out.print(" " + students.get(i).getLastName() + " ");
                System.out.print("[Grade]: " + students.get(i).getGrade() + " ");
                System.out.println("[ID]: " + students.get(i).getStudentNumber() + "\n");

            }
        }

        public void InitialTeachers(){ // setting the initial teacher count and adding set amount of teachers to list
            int NumofTeachers = 4; // setting the number of teachers to 4

            // adding default teacher to end of arraylist
            for(int i = 0; i<NumofTeachers; i++){
                Teacher NewTeacher = new Teacher();
                teachers.add(i,NewTeacher);
            }
        }
        public void PrintTeachers(){ // printing teacher list
            for(int i = 0; i<teachers.size(); i++){
                System.out.print("[Name]: " + teachers.get(i).getFirstName());
                System.out.print(" " + teachers.get(i).getLastName() + " ");
                System.out.println("[Subject]: " + teachers.get(i).getSubject() + "\n");
            }
        }

        public void RemoveTeacher(int NumOfTeachers){ // removing one teacher from list
            if (teachers.size() >= NumOfTeachers) { // checking if the size of the teacher arraylist is more than equal to the number of teachers
                PrintLine();
                System.out.println("\t\t[Removing Last Teacher]\n");
                for (int i = 0; i < NumOfTeachers; i++) {
                    teachers.remove(teachers.size() - 1); // removing teacher
                }
                PrintTeachers();
            } else {
                System.out.println("\n[No Teachers To Remove]\n");
            }
        }
        public void RemoveStudent(int NumOfStudents){ // removing one student from list
            if (students.size() >= NumOfStudents) { // checking if the size of the student arraylist is more than equal to the number of students
                PrintLine();
                System.out.println("\t\t[Removing Last Student]\n");
                for (int i = 0; i < NumOfStudents; i++) {
                    students.remove(students.size() - 1); // removing teacher
                }
                PrintStudents();
            } else {
                System.out.println("\n[No Students To Remove]\n");
            }

        }
        public void AddTeacher(){ // add one teacher to the list
            Teacher Rylan = new Teacher("Rylan", "Andre", "Math"); // creating a new teacher called Rylan
            teachers.add(teachers.size(), Rylan ); // adding teacher to end of the teacher arraylist

        }
        public void AddStudent(){ // add one student to the list
            Student James = new Student("James", "Bond", "A+"); // creating a new teacher called Rylan
            students.add(students.size(), James); // adding teacher to end of teacher arraylist
        }

    public void PrintLine(){ // printing line for UI
        System.out.println("********************************************************************\n");

    }









}