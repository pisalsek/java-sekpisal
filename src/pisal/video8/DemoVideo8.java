package pisal.video8;

import java.util.Scanner;

public class DemoVideo8 {
    public static void main(String[]args){

        //Switch case

        Scanner cin=new Scanner(System.in);
        int month;
        System.out.println("Enter Month : ");
        month = cin.nextInt();
        switch (month)
        {
            case 1:
                System.out.println("Name month : January");
                System.out.println("There are : 31d");
                break;
            case 2:
                System.out.println("Name month : Februry");
                System.out.println("There are : 28d and Every Four Year have 29d ");
                break;
            case 3:
                System.out.println("Name month : March");
                System.out.println("There are : 31d");
                break;
            case 4:
                System.out.println("Name month : April");
                System.out.println("There are : 30d");
                break;
            case 5:
                System.out.println("Name month : May");
                System.out.println("There are : 31d");
                break;
            case 6:
                System.out.println("Name month : Jun");
                System.out.println("There are : 30d");
                break;
            case 7:
                System.out.println("Name month : July");
                System.out.println("There are : 31d");
                break;
            case 8:
                System.out.println("Name month : August");
                System.out.println("There are : 31d");
                break;
            case 9:
                System.out.println("Name month :September");
                System.out.println("There are : 30d");
                break;
            case 10:
                System.out.println("Name month : Octber");
                System.out.println("There are : 31d");
                break;
            case 11:
                System.out.println("Name month : November");
                System.out.println("There are : 30d");
                break;
            case 12:
                System.out.println("Name month : December");
                System.out.println("There are : 31d");
                break;
            default:
                System.out.println("No Month and Day of the year!!");
                break;
        }
    }
}
