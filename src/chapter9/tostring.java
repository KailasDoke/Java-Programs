package chapter9;

public class tostring {


        public static void main(String[] args) {
            Student s = new Student();
            s.age=21;
            s.name="Kailas";
            System.out.println(s );
            System.out.println(s.city);
            System.out.println(s.city==s.name);
        }
    }


 class Student{
    String name;
    int age;
    String city = new String("kailas");
     @Override //override
     public String toString() {
         return "name "+name+ " age "+age;
     }
 }



