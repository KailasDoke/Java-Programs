package Equals;

public class equalsAndHashCodeTest {
    public static void main(String[] args){
        person p = new person("kd",21,"201");
        person p1 = new person("kd",21,"201");
        if(p.equals(p1)){
            System.out.println("equal");
        }else{
            System.out.println("Not equlas");
        }
        System.out.println(p);
        System.out.println(p.getName());
        p.setName("Vitthal");
        System.out.println(p.getAge());
        p.setAge(100);
        System.out.println(p.getId());
        p.setId("202");
    }
}
