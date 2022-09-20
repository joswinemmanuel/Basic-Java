public class Largest_of_three {
    public static void main(String[] args){
        int a=100, b=200, c=300;
        if(a>b && a>c){
            System.out.println("Largest : " + a);
        } else if(b > c){
            System.out.println("Largest : " + b);
        } else {
            System.out.println("Largest : " + c);
        }
    }
}

// Largest : 300