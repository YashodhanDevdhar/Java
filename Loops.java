import java.util.*;

public class Loops {
    public static void main(String[] args) {
        
        //---------FOR LOOP--------------//
  /*       for(int counter=0; counter<=10; counter++) {
            System.out.print(counter +" ");
        }
 */ 
        //--------WHILE LOOP------------//
/*         int i=0;
        while(i<=10) {
            System.out.print(i+" ");
            i++;
        }
*/      
        //--------DO WHILE------------------//
/*         int i=0;
        do {
            System.out.println(i);
        } while(i>1);
*/        

        //sum of first n numbers where n=4;
/*         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int m = sc.nextInt() ;
        int n=0;
        for(int i=0; i<=m; i++) {
            //int n=0;
            n= n+i;
            //System.out.println(n);
        }
        System.out.println(n);
 */      

        //table of a number;
/*         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its table : ");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++) {
            System.out.println(n + "*" + i + "=" + (n*i));
        }
*/       
        //print all even numbers till n
/*         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get even numbers till that number : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
*/
/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
*/      //========answeer======

        System.out.println("Enter a number either 1 or 0");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n==1){
            System.out.println("Enter your marks out of 100 : ");
            Scanner c= new Scanner(System.in);
            int a = c.nextInt();
            if(a>=90){
                System.out.println("This is good");
            }else if(89>= a && a>= 60){
                System.out.println("This is also good");
            }else if(59>= a && a>=0){
                System.out.println("This is good as well");
            }
            System.out.println("Enter a number either 1 or 0");
            n = c.nextInt();
        }
        if(n==0){
            System.out.println("Thank you!");
        }

        
    }
}
