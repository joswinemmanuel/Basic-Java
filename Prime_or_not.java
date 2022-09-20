public class Prime_or_not {
    public static void main(String[] args){
        int n=7, flag=1;
        for(int i=2; i<=(n/2); i++){
            if(n%i == 0){
                flag = 0;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

// Prime number