//Q] Enter 3 numbers from the user and make a function
//      to print thier averages.

import java.util.*;

public class Exercise1_1 {

    public static void main(String args[]) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("n1= ");
        int n1=sc.nextInt();
        System.out.print("n2= ");
        int n2=sc.nextInt();
        System.out.print("n2= ");
        int n3=sc.nextInt();
        float avg = (n1+n2+n3)/3;
        System.out.println("The average of the numbers is : "+avg);
    }

}