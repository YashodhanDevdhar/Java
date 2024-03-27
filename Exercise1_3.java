//Q] Write a function which takes in 2 numbers and 
//      returns the greater of those two.

import java.util.*;

public class Exercise1_3 {
    
    public static void greater(int n1, int n2) {
        int num1 = n1;
        int num2 = n2;
        if(num1>num2){
            System.out.println("n1 is greater!");
        }else {
            System.out.println("n2 is greater!");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.print("n1 = ");
        int n1= sc.nextInt();
        System.out.print("n2 = ");
        int n2= sc.nextInt();
        greater(n1,n2);
    }

}
