package pisal.video5;

import java.util.Scanner;

public class DemoVideo5 {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        Scanner cin=new Scanner(System.in);
        int a;
        System.out.print("Enter value a : ");
        a = cin.nextInt();
        if (a>0){
            if (a<=50){
                System.out.println("Statement1");
            }
            else if (a<=150) {
                System.out.println("Statement2");
            }
            else {
                System.out.println("Statement3");
            }
        }else
            System.out.println("Statement4");
    }
}
