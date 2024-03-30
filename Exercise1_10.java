//Q]Write a program to print Fibonacci series of
// n terms, where n is the input of the user.

import java.util.*;

public class Exercise1_10{
    public static void main(String[] args) {
        System.out.println("Enter the valuse of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1=0;
        int a2=1;        
        System.out.println("The Fibonacci series for "+n+" integers is : ");
        System.out.print(a1);
        if(n>1){
            System.out.print(" "+a2);
            for(int i=2;i<n;i++){
                int m;
                m = a1 + a2;
                System.out.print(" "+m);
                a1 = a2;
                a2 = m;
            }
        }
    }

}
