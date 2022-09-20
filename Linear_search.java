public class Linear_search {
    public static void main(String[] args){
        int arr[] = {10, 11, 23, 1, 2, 9}, x=2, flag=0, index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                flag = 1;
                index = i;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Value found at index " + index);
        } else {
            System.out.println("Value not found");
        }
    }
}

// Value found at index 4