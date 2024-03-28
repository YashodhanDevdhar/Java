//Q]Write a function that calculates the Greatest 
// Common Divisor of 2 numbers.

import java.util.*;

public class Exercise1_9 {
    
    public static int GCD(int n1, int n2) {
        int gcd = 1 ;
        int a1 = n1;
        int a2 = n2;
        int n;

        if(a1>a2){
            n=a1;
        } else {
            n=a2;
        }

        for(int i=1; i<=n; i++){
            if(a1%i==0){
                if(a2%i==0){
                    gcd=i;
                }
            }
        }

        return gcd;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        System.out.print("n1 = ");
        int n1 = sc.nextInt();
        System.out.print("n2 = ");
        int n2 = sc.nextInt();
        System.out.println("GCD of n1 and n2 is = "+GCD(n1,n2));

    }

}
