package Challenges;

public class arraytostring {
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
