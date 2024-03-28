//Q]Two numbers are entered by the user, x and n.
//Write a function to find the value of one number
//raised to the power of other number. i.e. : x^n.

import java.util.*;

public class Exercise1_8 {

    public static int power(int x, int n) {
        int a = x;
        int pwr = x;
        for(int j=1;j<n;j++){
            
            pwr= pwr * a;
        }
        return pwr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("x^n is = "+ power(x,n));
    }
    
}
