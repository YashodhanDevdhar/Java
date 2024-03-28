//Q]Write a function that takes in the age as input
//      and returns if the person is eligible to vote
//      or not.A person of age > 18 is eligible to vote

import java.util.*;

public class Exercise1_5 {

    public static void eligibility(int age) {
        if(age>=18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        System.out.print(" age = ");
        int age = sc.nextInt();
        eligibility(age);
    }
    
}
