import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        /* 
        // -------if,else----------------//
        //1] to check eligible for voting or no
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting!");
        }
        */
        /*
        //2] odd or even
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        
        int n = sc.nextInt();

        if(n%2==0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
         */
        /*
        //3] 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) 
            System.out.println("Equal");
        else if( a > b) 
            System.out.println(a+" is greater");
        else 
            System.out.println(b+" is greater");
         */

        //4] else if and Switch
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any one number from : 1,2,3");
        int n = sc.nextInt();
        if(n==1) {
            System.out.println("Hello");
        } else if(n==2) {
            System.out.println("Namaste");
        } else {
            System.out.println("Bounjour");
        }
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("press a button : ");
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
         */
        



        // HW 1] Calculator:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the operation to perform : +,-,*,/,%");
        String o = sc.next();
        switch(o) {
            case "+" : System.out.println(a+"+"+b+"="+(a+b)); 
            break;
            case "-" : System.out.println(a+"-"+b+"="+(a-b));
            break;
            case "*" : System.out.println(a+"*"+b+"="+(a*b)); 
            break;
            case "/" : System.out.println(a+"/"+b+"="+(a/b)); 
            break;
            case "%" : System.out.println(a+"%"+b+"="+(a%b)); 
            break;
            default:System.out.println("wrong data");
        }
    }
}
