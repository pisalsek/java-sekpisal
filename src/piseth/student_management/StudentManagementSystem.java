package piseth.student_management;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        /*
        * -----------------------student management-----------------------------------------
        * 1. add student
        * 2. show all students
        * 3. update students
        * 4. delete students
        * 5. exit
        * */

        Scanner cin = new Scanner(System.in);
        int menu;
        Student[] students = null;
        do {
            System.out.println("-----------------------student management-----------------------");
            System.out.println("1. add student");
            System.out.println("2. show all students");
            System.out.println("3. update students");
            System.out.println("4. delete students");
            System.out.println("5. exit");
            System.out.print("Choose menu : ");
            menu = cin.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("--------Add students--------");
                    System.out.print("Enter Numher of student to add : ");
                    int numberOfStudent = cin.nextInt();
                    students = new Student[numberOfStudent];

                    for (int i = 0; i < numberOfStudent; i++) {
                        System.out.print("Enter Student ID : ");
                        int id = cin.nextInt();
                        System.out.print("Enter Student Name : ");
                        cin.nextLine();
                        String name =cin.nextLine();
                        System.out.print("Enter Student Age : ");
                        int age = cin.nextInt();
                        System.out.print("Enter Student Gender : ");
                        cin.nextLine();
                        String gender =cin.nextLine();
                        students[i] = new Student(id, name, age, gender);
                    }
                    break;
                case 2:
                    System.out.println("--------Show students--------");
                    for (Student obj : students){
                        System.out.println(obj);
                    }
                    break;
                case 3:
                    System.out.println("--------Update students--------");
                    System.out.print("Enter Student ID To Update : ");
                    int upId = cin.nextInt();
                    for (int i = 0; i<students.length; i++) {
                        if (students[i].id == upId) {
                            System.out.print("Enter Student Name : ");
                            cin.nextLine();
                            String name = cin.nextLine();
                            System.out.print("Enter Student Age : ");
                            int age = cin.nextInt();
                            System.out.print("Enter Student Gender : ");
                            cin.nextLine();
                            String gender =cin.nextLine();
                            students[i] = new Student(upId, name, age, gender);
//                            students[i] = new Student(id, name, age, gender);
                        }
                    }
                    break;
                case 4:
                    System.out.println("--------Delete students--------");

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Chosen Menu!!!!");
            }

        } while (menu != 5);

    }
}
