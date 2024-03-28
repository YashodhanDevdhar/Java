//Q] Write a program to enter the numbers till the 
//user wants and at the end it should display the
//count of positive,negative and zeroes entered

import java.util.*;
public class Exercise1_7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int positive=0, negative=0, zeroes=0;
        System.out.println("Press 1 to continue and 0 to stop");
        int input=sc.nextInt();
        while(input==1){
            System.out.println("Enter the number : ");
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }else if(number<0) {
                negative++;
            }else {
                zeroes++;
            }
            System.out.println("enter 1 to continue and 0 to stop.");
            input = sc.nextInt();
        }
        System.out.println("The positive numbers are: "+positive);
        System.out.println("The negative numbers are: "+negative);
        System.out.println("The number of times 0 occured is: "+zeroes);

    }
    
}
