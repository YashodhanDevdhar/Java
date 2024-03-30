import java.util.*;

public class Arrays {
    // public static void main(String[] args){
    //     // //int[] marks = new int[5];
    //     // int marks[] = new int[3];
    //     // marks[0]=97;
    //     // marks[1]=90;
    //     // marks[2]=99;
    //     // for(int i =0;i<3;i++){
    //     //     System.out.println(marks[i]);
    //     // }
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter size for the array : ");
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];
    //     System.out.println("enter "+size+" values:");
    //     for(int i=0; i<size;i++){
    //         numbers[i] = sc.nextInt();
    //     }
    //     System.out.print("Your values are: ");
    //     for(int i=0; i<size;i++){
    //         System.out.print(numbers[i]+" ");
    //     }
    // }

//--------------------------------------------------------------------------------------------------------------------

    /*Q] Take an array as input from the user.
     * Search for a given number x and
     * print the index at which it occurs.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size for the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        System.out.println("Enter values for the array : ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("enter the value (among the input you have given) to know its index in the array: ");
        int x = sc.nextInt();

        for(int i=0;i<size;i++){
            if(x==numbers[i]){
                System.out.println("the index of "+x+" is "+i);
            }
        }

    }

}
