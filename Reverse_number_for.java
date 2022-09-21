public class Reverse_number_for {
    public static void main(String[] args){
        int num=1234, ans=0;
        for(int p=num; p!=0; p/=10){
            ans = (ans*10) + (p%10);
        }
        System.out.println("Reverse is : " + ans);
    }
}

// Reverse is : 4321