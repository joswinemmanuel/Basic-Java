public class Bubble_sort {
    public static void main(String[] args){
        int arr[] = {10, 21, 32, 1, 4, 2}, n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nSecond largest : " + arr[n-2]);
        System.out.println("Second smallest : " + arr[1]);
    }
}

/*
1 2 4 10 21 32 
Second largest : 21
Second smallest : 2
*/