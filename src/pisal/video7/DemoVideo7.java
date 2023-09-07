package pisal.video7;

import java.util.Scanner;

public class  DemoVideo7 {
    public static void main( String[]args){
        System.out.println("--------------");
        Scanner cin=new Scanner(System.in);
        double  newIndex,oldIndex;
        System.out.print("Enter New Index = ");
        newIndex = cin.nextDouble();
        System.out.print("Enter Old Index = ");
        oldIndex = cin.nextDouble();

        if (oldIndex>=0 && newIndex>=oldIndex){
            double con,payment;
            con=newIndex-oldIndex;
            if (con<=50){
                payment=con*350;
            }
            else if (con<=150) {
                payment=(con-50)*650 + 50*350;
            }
            else {
                payment=(con-150)*950 + 100*650+50*350;
            }
            System.out.println("Comsumption = "+con+"km/h");
            System.out.println("Payment = "+payment);
        }
    }
}
