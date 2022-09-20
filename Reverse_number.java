public class Reverse_number {
    public static void main(String[] args){
        int num=1234, p=num, ans=0;
        while(p != 0){
            ans = (ans*10) + (p%10);
            p /= 10;
        }
        System.out.println("Reverse of " + num + " is : " + ans);
    }
}

// Reverse of 1234 is : 4321