package pisal.practice;

import java.util.Scanner;


public class Menu {
    public static void main(String[]args) {

        System.out.println("====================");
        Scanner cin = new Scanner(System.in);
        System.out.println("---------School Management System---------");
        System.out.println("1. Manage Teacher");
        System.out.println("2. Manage Student");
        System.out.println("3. Manage Staff");
        System.out.println("4. Exit.");
        int menu;
        do {
            System.out.println("Choos Menu : ");
            menu = cin.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("1. --------------Mange Teacher-------------");
                    System.out.println("1. add new teacher");
                    System.out.println("2. update teacher by id");
                    System.out.println("3. delete teacher by id");
                    System.out.println("4. view all teacher");
                    System.out.println("5. find teacher by id");
                    System.out.println("6. Exit");
                    int choose;
                    do {
                        System.out.println("please select the function you want..");
                        choose = cin.nextInt();
                        switch (choose) {
                            case 1:
                                System.out.println("1. add new teacher");

                                break;
                            case 2:
                                System.out.println("2. update teacher by id");
                                break;
                            case 3:
                                System.out.println("3. delete teacher by id");
                                break;
                            case 4:
                                System.out.println("4. view all teacher");
                                break;
                            case 5:
                                System.out.println("5. find teacher by id");
                                break;
                            case 6:
                                System.out.println("6 .Exit");
                                break;
                        }
                    }while (!(choose >= 1 && choose <=6));
                }
        }while (!(menu >= 1 && menu <= 5)) ;
    }

}

