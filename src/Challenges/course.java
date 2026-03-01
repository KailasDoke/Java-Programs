package Challenges;

public class course {
    static int maxCapacity = 100;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    course(String courseName){
        this.courseName = courseName;
        enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }



    static void setMaxCapacity(int maxCapacity){

        course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }



    public static void main(String[] args){
        course c1 = new course("java");
        course.setMaxCapacity(2);
        c1.enrollStudent("Kailas");
        System.out.println("course:" +c1.courseName);
        System.out.println("student name: " + c1.enrolledStudents[0]);
    }
}


