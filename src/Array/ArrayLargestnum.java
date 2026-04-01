package Array;

public class ArrayLargestnum {
    public static void main(String[] args) {
        int[] arr ={1,3,2,4,56,4,3,5,66,100};
        int max = arr[0];
        for(int i= 0;i<arr.length;i++){
            if(max > arr[i]);
            max = arr[i];
        }
        System.out.println(max);
    }
}
