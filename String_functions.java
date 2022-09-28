import java.util.Scanner;

public class String_functions {
    public static void main(String[] args){
        // String using character array
        char charArray[] = new char[3];
        charArray[0] = 'C';
        charArray[1] = 'A';
        charArray[2] = 'R';
        System.out.println(charArray);
        // CAR
        System.out.println();

        Scanner input = new Scanner(System.in);

        // String using String class
        /*String fname, lname;
        System.out.print("Enter your first name : ");
        fname = input.nextLine();
        System.out.print("Enter your last name : ");
        lname = input.nextLine();
        System.out.println(fname + lname);*/
        // String concatenation using +
        /*
        Enter your first name : Joswin
        Enter your last name : Emmanuel wo
        JoswinEmmanuel wo */

        String arrayOfname[] = new String[3];
        arrayOfname[0] = "Joswin";
        arrayOfname[1] = "Bibin";
        arrayOfname[2] = "Agath";
        for(int i=0; i<arrayOfname.length; i++){
            System.out.print(arrayOfname[i] + " ");
        }
        // Joswin Bibin Agath
        System.out.println("\n");

        String s1, s2;

        // 1) toLowerCase()
        s1 = "HELLO";
        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        // hello
        // HELLO
        System.out.println();

        // 2) toUpperCase()
        s1 = "hello";
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        // HELLO
        // hello
        System.out.println();

        // 3) replace()
        s1 = "hello";
        System.out.println(s1.replace('l', 'x'));
        System.out.println(s1);
        //hexxo
        //hello
        System.out.println();

        // 4) trim()
        s1 = "      Hello      ";
        System.out.println(s1.trim());
        System.out.println(s1);
        // Hello
        //      Hello
        s1 = "\tHey";
        System.out.println(s1.trim());
        System.out.println(s1);
        // Hey
        //        Hey
        System.out.println();

        // 5) equal()
        s1 = "hello";
        s2 = "hello";
        System.out.println(s1.equals(s2));
        // true
        s2 = "HELLO";
        System.out.println(s1.equals(s2));
        // false
        System.out.println();

        // 6) equalIsIgnoreCase()
        s1 = "hello";
        s2 = "hello";
        System.out.println(s1.equals(s2));
        // true
        s2 = "HELLO";
        System.out.println(s1.equals(s2));
        // false
        System.out.println();

        // 7) length()
        s1 = "joswin";
        System.out.println(s1.length());
        // 6
        System.out.println();

        // 8) charAt()
        s1 = "joswin";
        System.out.println(s1.charAt(3));
        // w
        System.out.println();

        // 9) compareTo()
        s1 = "hello";
        s2 = "hello";
        System.out.println(s1.compareTo(s2));
        // 0 , as s1 = s2
        s1 = "hello";
        s2 = "Hello";
        System.out.println(s1.compareTo(s2));
        // 32 , as s1 > s2
        s1 = "Hello";
        s2 = "hello";
        System.out.println(s1.compareTo(s2));
        // -32 , as s1 < s2
        System.out.println();

        // 10) concatenate()
        s1 = "Joswin";
        s2 = "Emmanuel";
        System.out.println(s1.concat(s2));
        System.out.println(s1);
        // JoswinEmmanuel
        // Joswin
        System.out.println();

        // 11) substring(n)
        s1 = "Joswin";
        System.out.println(s1.substring(3));
        // win
        System.out.println();

        // 12) substring(n, m)
        s1 = "Joswin";
        System.out.println(s1.substring(3,5));
        // wi
        System.out.println();

        // 13) indexOf()
        s1 = "Hello";
        System.out.println(s1.indexOf('l'));
        // 2
        System.out.println();

        // 14) lastIndexOf()
        s1 = "Hello";
        System.out.println(s1.lastIndexOf('l'));
        // 3
        System.out.println();
    }
}
