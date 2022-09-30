import java.util.Scanner;

public class StringBuffer_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* ACCEPT USER INPUT using StringBuffer string */
        // StringBuffer str = new StringBuffer("");
        // System.out.print("Enter the string : ");
        // str.append(sc.nextLine());

        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer(" New");
        String s3 = " World";

        /* 1) append() */
        s1.append(s2);
        System.out.println(s1);
        // Hello New
        s1.append(s3);
        System.out.println(s1);
        // Hello New World

        /* 2) Insert() */
        s1.insert(5, s3);
        System.out.println(s1);
        // Hello World New World

        /* 3) setCharAt() */
        s1.setCharAt(6, 'w');
        System.out.println(s1);
        // Hello world New World

        int n;
        /* 4) setLength() */
        s1.setLength(11);
        System.out.println(s1);
        // Hello world

        /* 5) replace() */
        s1.replace(0, 5, "Hey");
        System.out.println(s1);
        // Hey world

        /* 6) delete() */
        s1.delete(5, 7);
        System.out.println(s1);
        // Hey wld

        /* 7) reverse() */
        s1.reverse();
        System.out.println(s1);
        // dlw yeH
        
    }
}