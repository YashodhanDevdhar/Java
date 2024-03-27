import java.util.*;

public class Pattern2 {

    public static void main(String args[]) {

        /* 10] BUTTERFLY PATTERN
         
         *             *
         * *         * *
         * * *     * * *
         * * * * * * * *
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *
         
         */ 

    //    int n=4;
    //    // upper portion 
    //    for(int i=1; i<=n;i++){
    //     //P1
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     //P2
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print("  ");
    //     }
    //     //P3
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }

    //     System.out.println();
    //    }

    //    //lower portion
    //    for(int i=1;i<=n;i++){
    //     //P1
    //     for(int j=n;j>=i;j--){
    //         System.out.print("* ");
    //     }
    //     //P2
    //     for(int j=n+1;j>=2*(n-i);j--){
    //         System.out.print("  ");
    //     }
    //     //P3
    //     for(int j=n;j>=i;j--){
    //         System.out.print("* ");
    //     }

    //     System.out.println();
    //    }

//___________________________________________________________________________________________

    /*11]SOLID RHOMBUS
          *****
         *****
        *****
       *****
      ***** 
     */

    //  int n=5;
    //  for(int i=1; i<=n; i++) {

    //     for(int j=1; j<=n-i; j++){
    //         System.out.print("  ");
    //     }

    //     for(int j=1; j<=n; j++){
    //         System.out.print("* ");
    //     }

    //     for(int j=n-1;j>n-i;j--){
    //         System.out.print("  ");
    //     }

    //     System.out.println();
    //  }

    
    /*12] NUMBER PYRAMID
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5 
     */

     int n=5;

     for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            for(int k=i;k<=i;k++){
                System.out.print(k);
            }
        }
        System.out.println();
     }


    }

}