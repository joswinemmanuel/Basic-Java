import java.util.Scanner;

public class Split_in_java {
    public static void main(String[] args){
        String s;
        s = "Rob Bre Rose";
        for(String a : s.split(" ", 3)){
            System.out.print(a);
        }
    }
}