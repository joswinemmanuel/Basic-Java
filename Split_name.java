import java.util.Scanner;

public class Split_name {
    public static void main(String[] args){
        String s;
        char s1, s2;
        s = "Rob Bre Rose";
        String str_array[] = s.split(" ");
        s1 = str_array[0].charAt(0);
        s2 = str_array[1].charAt(0);
        System.out.println(s1+"."+s2+"."+str_array[2]);
        
    }
}
