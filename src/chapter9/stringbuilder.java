package chapter9;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My data");
        sb.append(21);
        sb.append(" roll no ");
        sb.append("cgpa ");
        sb.append(9.15);
        System.out.println(sb);
    }

}
