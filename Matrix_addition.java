import java.util.Scanner;

public class Matrix_addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[][], arr2[][], arr3[][], row, column;

        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        column = input.nextInt();
        System.out.println();

        arr1 = new int[row][column];
        arr2 = new int[row][column];
        arr3 = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr1["+i+"]["+j+"] : ");
                arr1[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr2["+i+"]["+j+"] : ");
                arr2[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of arr1 and arr2 is");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}