import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original, rev;

        System.out.print("Enter the string to check : ");
        original = sc.nextLine();

        StringBuffer str = new StringBuffer(original);

        str.reverse();
        rev = str.toString();

        if(original.equals(rev))
            System.out.println(original + " is a PALINDROME");
        else
            System.out.println(original + " is not a PALINDROME");
    }
}

/*
Enter the string to check : malayalam
malayalam is a PALINDROME

Enter the string to check : joswin
joswin is not a PALINDROME
*/