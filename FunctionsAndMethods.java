import java.util.*;

public class FunctionsAndMethods{

    /*1] Print a given name in function */

    // public static void printName(String name) {
    //     System.out.println(name);
    //     return;
    // };

    // public static void main(String args[]) {
    //     System.out.println("Enter your name : ");
    //     Scanner sc = new Scanner(System.in);
    //     //String name = sc.toString();
    //     String name = sc.next(); 

    //     printName(name);
    // }


    /*2] Make a function to add 2 numbers and return the sum. */

    // public static int addNumbers(int num1, int num2) {
    //     int sum= num1 + num2;
    //     return sum;
    // }

    // public static void main(String args[]) {
    //     System.out.println("Enter two numbers : ");
    //     Scanner sc= new Scanner(System.in);
    //     int n1=sc.nextInt();
    //     int n2=sc.nextInt();
    //     int sum = addNumbers(n1,n2);
    //     System.out.println("Addition is : "+sum);
    // }


    /*3] Make a function to multiply 2 numbers and return the produt */
    // public static int multiplyNumbers(int num1, int num2) {
    //     //int product = num1 * num2;
    //     return num1*num2;
    // }

    // public static void main(String args[]) {
    //     System.out.println("Enter two numbers : ");
    //     Scanner sc= new Scanner(System.in);
    //     int n1=sc.nextInt();
    //     int n2=sc.nextInt();
    //     //int product = multiplyNumbers(n1, n2);
    //     System.out.println("Multiplication is : "+multiplyNumbers(n1, n2));
    // }


    /*4] Find the factorial of a number */

    // public static int calculateFactorial(int num) {
    //     if(num==0){
    //         return 1;
    //     }
    //     else 
    //         return(num * calculateFactorial(num-1));
        
    // }

    // public static void main(String args[]) {
    //     System.out.print("enter a number to find its factorial : ");
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     System.out.println(calculateFactorial(number));
    // }


    /*hw 1] Make a function to check if a number is prime */
    public static void isPrime(int n){
        int remainder;
        int a = 0;
        for(int i =2; i<=n/2; i++){
            remainder = n % i;
            if(remainder==0){
                a=1;
            }
            
        }
        if(a==1){
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
        
    }

    public static void main(String args[]) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }
}
