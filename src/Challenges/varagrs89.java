package Challenges;

public class varagrs89 {
    public static void main(String[] args) {
        System.out.println(concatenate("Kailas"));
        System.out.println(concatenate("Doke" ,"Kailas ", " Address"));
    }
    public static String concatenate(String...strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }

}
