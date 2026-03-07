package Challenges;

public class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name ;
        int age ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student("kailas", 21 );
        System.out.println(s);
    }
}