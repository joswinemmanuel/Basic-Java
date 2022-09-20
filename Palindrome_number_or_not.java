public class Palindrome_number_or_not {
    public static void main(String[] args){
        int num=1234321, p=num, ans=0;
        while(p != 0){
            ans = (ans*10) + (p%10);
            p /= 10;
        }
        if(ans == num){
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}

// Palindrome number