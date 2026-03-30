package chapter14;

public class throwsandthrow {
    public static void main(String[] args) {
        throwsandthrow n = new throwsandthrow();
        n.printName("nd-j");


    }

    public void printName(String name) throws IllegalArgumentException {
        if (name.contains("-")) {
            throw new IllegalArgumentException("Name contains - ");
        }
        System.out.println(name);

    }
}