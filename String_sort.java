import java.util.Scanner;

public class String_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of students : ");
        n = input.nextInt();
        String name[] = new String[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter name of student " + (i+1) + " : ");
            name[i] = input.next();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(name[j].compareTo(name[j+1]) > 0){
                    String temp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted in lexical order");
        for(int i=0; i<n; i++){
            System.out.print(name[i] + " ");
        }
    }
}

/*
Enter the number of students : 3
Enter name of student 1 : Joswin
Enter name of student 2 : Bibin
Enter name of student 3 : Car

Sorted in lexical order
Bibin Car Joswin
*/