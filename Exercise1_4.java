//Q]Write a function that takes in the radius as
//      input and returns the circumference of circle

import java.util.*;

public class Exercise1_4{

    public static float circumference(float r) {
        float circumference= (2*22*r)/7 ;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        System.out.println("The circumference of the circle is : "+ circumference(r));

    }

}