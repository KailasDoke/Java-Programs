public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        boolean vk = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                vk = true;
                break;
            }
        }
    
        if (vk) {
            System.out.println("unsorted");
        } else {
            System.out.println("sorted");
        }
    }
}