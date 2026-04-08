package Array;

public class findnum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,43,2,1,34,2,1,2,3,2,22};
        boolean f = true;
        int k = 34;

        for (int i = 0;i<13;i++){
            if (arr[i]==k){
                f =true;
            }


        }
        if(f){
            System.out.println("found");
        }
        else {
            System.out.println("not found ");
        }
    }
}
