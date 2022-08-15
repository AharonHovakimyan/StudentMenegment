package students;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;

public interface Commands {

    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int PRINT_STUDENT_COUNT = 3;
    int DELETE_STUDENT_BY_INDEX = 4;
    int PRINT_STUDENTS_BY_LESSON = 5;
    int CHANGE_STUDENT_LESSON = 6;
    int ADD_LESSON = 7;
    int PRINT_ALL_LESSON = 8;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTR = 2;



    static void Commands() {
        System.out.println(" Please input " + LOGOUT + " for exit ");
        System.out.println(" Please input " + ADD_STUDENT + " for add student ");
        System.out.println(" please input " + PRINT_ALL_STUDENTS + " for print all students ");
        System.out.println(" please input " + PRINT_STUDENT_COUNT + " for print students count");
        System.out.println(" please input " + DELETE_STUDENT_BY_INDEX + " for delete student by index ");
        System.out.println(" please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println(" please input " + CHANGE_STUDENT_LESSON + " for change students lesson ");
        System.out.println(" please input " + ADD_LESSON + " for Add lesson");
        System.out.println(" please input " + PRINT_ALL_LESSON + " for print all lesson ");

    }

    static void printCommands() {
        System.out.println(" Please input " + EXIT + " for Exit ");
        System.out.println(" Please input " + LOGIN + " for Login");
        System.out.println(" Please input " + REGISTR + " for REGISTR ");

    }

    static void printUserCommands() {
        System.out.println(" Please input " + LOGOUT + " for exit ");
        System.out.println(" Please input " + ADD_STUDENT + " for add student ");
        System.out.println(" please input " + PRINT_ALL_STUDENTS + " for print all students ");
        System.out.println(" please input " + PRINT_STUDENT_COUNT + " for print students count");
        System.out.println(" please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println(" please input " + PRINT_ALL_LESSON + " for print all lesson ");
    }
}
