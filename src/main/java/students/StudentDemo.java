package students;

import java.util.Scanner;

import static students.Commands.EXIT;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);

    private static StudentStorage studentStorage = new StudentStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("poxos", "Poxsoyan", "18", "93499148", "gyumri"));
        userStorage.add(new User("admin", "admin", "admin@mail.com", "admin" ,Role.ADMIN));
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalid commmand, please try again");
            }
        }
    }

    private static void register() {


        System.out.println("please input name, surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct user data");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("user registered!");
            } else {
                System.out.println(" User with " + userData[2] + "already exists");
            }

        }

    }


    private static void login() {
        System.out.println("please input email, password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User does not exists !");
        } else {
            if (!user.getPassword().equals(emailPassword[1])) {
                System.out.println("password is wrong!");
            }
            else {
                if (user.getRole() == Role.ADMIN){
                    adminlogin();
                } else if (user.getRole() == Role.USER) {
                    userlogin();

                }
            }
        }
    }

    private static void userlogin() {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }


            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                case 4:
                    studentStorage.print();
                    System.out.println("please choose student index ");
                    int index = Integer.parseInt(scanner.nextLine());
                    StudentStorage.delete(index);
                    break;
                default:
                    System.out.println(" Invalid command, please try again  ");
            }

        }
    }


    private static void adminlogin() {
        boolean run = true;
        while (run) {
            Commands.Commands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }


           // System.out.println(" please input 0  for exit ");
           // System.out.println(" please input 1  for add student ");
            //System.out.println(" please input 2  for print all students ");
            //System.out.println(" please input 3  for print students count ");
            //System.out.println(" please input 4  for delete student by index");


            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                case 4:
                    studentStorage.print();
                    System.out.println("please choose student index ");
                    int index = Integer.parseInt(scanner.nextLine());
                    StudentStorage.delete(index);
                    break;
                default:
                    System.out.println(" Invalid command, please try again  ");
            }

        }
    }

    private static void addStudent() {
        System.out.println("please input student name");
        String name = scanner.nextLine();
        System.out.println("please input student surname");
        String surname = scanner.nextLine();
        System.out.println("please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input student city");
        String city = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city);
        studentStorage.add(student);
        System.out.println("Thank you, student added ");
    }

}





