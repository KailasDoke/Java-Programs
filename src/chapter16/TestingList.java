package chapter16;
//Array list
import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List  strlist = new ArrayList ();
        strlist.add(10);
        strlist.add("KAils");
        strlist.add(1,"Doke");
        //strlist.remove(2 );
        System.out.println(strlist.size());
        for (int i = 0; i < strlist.size(); i++) {
            System.out.println(strlist.get(i));
        }
    }
}
