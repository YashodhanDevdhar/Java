//Q] Write a function to print the sum of all odd
//      numbers from 1 to n.

import java.util.*;

public class Exercise2_2 {
    
    public static int sum(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("the sum of all odd numbers till n is: "+sum(n));
    }

}
