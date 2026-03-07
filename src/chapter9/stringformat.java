package chapter9;

public class stringformat {
    public static void main(String[] args) {
        int marks = 45;
        String name = "Kailas";
        String nam = "Kailas";
        System.out.println("My name is "+name+ " and my marks is "+marks);
        System.out.printf("My name is %S and my marks is %d ", name , marks);
        if(name.equals(nam)){
            System.out.println("\ndddddddd");
        }
    }
}
