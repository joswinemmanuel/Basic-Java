public class Maximum_element {
    public static void main(String[] args){
        int arr[] = {1, 2, 10, 4, 5}, max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum : " + max);
    }
}

// Maximum : 10