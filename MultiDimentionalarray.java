
import java.util.Scanner;

public class MultiDimentionalarray {
    //Here I going to print the matrix..

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[10][10];
        System.out.println("Enter the value for rows and cols");
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("The matrix elemets are : ");
        for(int i= 0; i<rows; i++){
                for(int j=0;j<cols;j++){
                  System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
           } 
    
     }
}