import java.util.*;

public class Patterns1 {

    /*
     * 1] SOLID RECTANGLE
     * 4 rows, 5 columns:
     *****
     *****
     *****
     *****
     */

    // public static void main(String[] args) {
    //  outer loop
    //  for(int i=0;i<4;i++) {
    //      //inner loop
    //      for(int j=0;j<5;j++) {
    //          System.out.print("*");
    //      }
    //      System.out.println();
    //  }
    // }




    //______________________________________________________________________________________________________________




    /* 2] HOLLOW RECTANGLE
     4 rows, 5 columns:
     *****
     *   *
     *   *
     *****
     */

    //  public static void main(String args[]){
    //     int n=4;
    //     int m=5;

    //     //outer loop
    //     for(int i=1; i<=n; i++) {
    //         //inner loop
    //         for(int j=1; j<=m; j++) {
    //             //we are in a cell (i,j)
    //             //give the condition
    //             if(i==1 || j==1 || i==n || j==m) {
    //                 System.out.print("*");
    //             } else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //  }




    //_______________________________________________________________________________________________________




    /*3] HALF PYRAMID
     4 rows:
     *
     **
     ***
     ****
     */

    //  public static void main(String args[]) {
    //     int n=4;
    //     //int m=4;

    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //  }



    //_______________________________________________________________________________________________________




    /*4]INVERTED HALF PYRAMID
     4 rows;
     ****
     ***
     **
     *
      */

     /*TWO WAYS TO SOLVE THIS PROBLEM */
     
     /*1st WAY */
    // public static void main(String args[]) {
    //     int n=4;
    //     for(int i=n; i>=1; i--) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    /*2nd WAY */
    // public static void main(String args[]) {
    //     int n=4;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=(5-i); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________




    /*5] INVERTED HALF PYRAMID (rotated by 180 deg) 
       *
      ** 
     *** 
    ****
    */

    // public static void main(String args[]) {
    //     int n=4;
    //     // outer loop
    //     for(int i=1; i<=n; i++) {
    //         //inner loop -> space print
    //         for(int j=1; j<=(n-i); j++) {
    //             System.out.print(" ");
    //         }

    //         //inner loop -> star print
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________




    /*6] 
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5   
     */
    
    // public static void main(String[] args) {
    //     //int n=5;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("please enter the number : ");
    //     int n = sc.nextInt();
        
    //     //outer loop
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________




    /*7] INVERTED HALF PYRAMID WITH NUMBERS
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */
    
    // 1st WAY 
    // public static void main(String args[]) {
    //     int n=5;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=(n+1-i); j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //2nd WAY
    // public static void main(String args[]) {
    //     int n=5;
    //     for(int i=n; i>=1; i--) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________




    /*8] FLOYDS TRIANGLE
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
    */

    // public static void main(String args[]) {
    //     int n=5;
    //     int k=1;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(k+" ");
    //             k++;
    //         }
    //         // k++;
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________




    /*9] 0-1 TRIANGLE
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    */

    // public static void main(String args[]) {
    //     int n=5;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if((i-j)%2==0) {    //or you can go with the sum -> (i+j)%2==0
    //                 System.out.print(1+" ");
    //             } else {
    //                 System.out.print(0+" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }



    //_______________________________________________________________________________________________________



    /*10] */

}
