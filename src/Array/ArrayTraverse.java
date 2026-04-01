package Array;

public class ArrayTraverse {
    public static void main(String[] args) {

         int arr[]={10,2,3,4,5,3,2,1,3,2};
         for(int i =0;i< arr.length;i++){
             System.out.print(" "+arr[i]);
         }

    }

    public static class arraytostring {
        public static void main(String[] args) {
            String[] arr = new String[] {"This "
                    ,"is the ","best"," course","" +
                    " in"," java"," on"," yt"};

            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s).append(" ");

            }
            System.out.println(sb);

        }
    }
}
