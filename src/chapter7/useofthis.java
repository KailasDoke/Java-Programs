package chapter7;

public class useofthis {
    public static void main(String[] args){
        student s1 = new student("Kailas");
        System.out.println(s1.name);
    }
}
class student{
    String name;  //    INSTANCE VARIABLE

    student(String name){
        this.name = name;

    }
}
