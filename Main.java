import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        School mySchool = new School();

        //UI:

        Scanner scan = new Scanner(System.in); // creating a new scanner
        String userChoice =""; //initializing user choice


        // Initial set of students and teachers
        mySchool.InitialStudents();
        mySchool.InitialTeachers();
        // Title
        System.out.println("\t\t\t[SCHOOL DATABASE]\n");

        // top header
        System.out.println("\t\t\t[CURRENT STUDENTS]");
        mySchool.PrintStudents();
        System.out.println("\t\t\t[CURRENT TEACHERS]");
        mySchool.PrintTeachers();


        while(!userChoice.equals("q")) { // checking for quit option
            mySchool.PrintLine();
            System.out.println("\n[Options: add teacher (at), add student (as), delete teacher (dt), delete student (ds), show teacher list (tl), show student list (sl), or Quit (q)] ");

            System.out.print("[What would you like to do?]: ");
            userChoice = scan.nextLine(); // taking the user choice and saving it to "userChoice"

            switch (userChoice) { // switch with all the choices
                case "at":
                    System.out.println("\t\t[Adding Teacher]\n");
                    mySchool.PrintTeachers();
                    mySchool.AddTeacher();
                    mySchool.PrintTeachers();
                    break;
                case "as":
                    mySchool.PrintLine();
                    System.out.println("\t\t[Adding Student]\n");
                    mySchool.PrintStudents();
                    mySchool.AddStudent();
                    mySchool.PrintLine();
                    System.out.println("\t\t\t[New List]\n");
                    mySchool.PrintStudents();
                    break;
                case "dt":
                    mySchool.RemoveTeacher(1); // removing 1 teacher
                    break;
                case "ds":
                    mySchool.RemoveStudent(1); // removing 1 student
                    break;
                case "tl":
                    System.out.println("\t\t[Showing Teacher List]\n");
                    mySchool.PrintTeachers();
                    break;
                case "sl":
                    System.out.println("\t\t[Showing Student List]\n");
                    mySchool.PrintStudents();
                    break;
                default:
                    System.out.println("\n[INVALID CHOICE]\n");
                    break;
            }


        }
        if (userChoice.equals("q")){ // checking if the user choice is equal to "q"
            System.out.println("\n[QUIT]"); // printing quit if true
        }



    }

}