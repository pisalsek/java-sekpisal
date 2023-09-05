package pisal.video6;

import java.util.Scanner;

public class DemoVideo6 {
    public static void main(String[] args) {
        System.out.println(" -------------------------------- ");
        Scanner cin=new Scanner(System.in);
        int p1,p2,p3;
        System.out.print("Enter Quantity1 = ");
        p1 = cin.nextInt();
        System.out.print("Enter Quantity2 = ");
        p2 = cin.nextInt();
        System.out.print("Enter Quantity3 = ");
        p3 = cin.nextInt();
        if (p1>0 && p2 > 0 && p3 > 0){
            double total,dis,disprice = 0,payment=0;
            int ticket;
            total=p1+p2+p3;
            if (total<1){
                dis=0;
             }
            else if (total<50)
            {
                 dis=5;
                 disprice=total*dis/100;
                payment=total-disprice;
            }
            else if (total<150)
            {
                dis=10;
                disprice=total*dis/100;
                payment=total-disprice;
            } else
            {
                dis=15;
                disprice=total*dis/100;
                payment=total-disprice;
            }
            System.out.println("===============");
            ticket=(int)total/10;
            System.out.println("Total = "+total+"$");
            System.out.println("Discount = "+dis+"%");
            System.out.println("Discount price = "+disprice+"$");
            System.out.println("Payment = "+payment+"$");
            System.out.println("Ticket = "+ticket+"t");
        }else {
            System.out.println("Invalided Input!!");
        }
    }
}
