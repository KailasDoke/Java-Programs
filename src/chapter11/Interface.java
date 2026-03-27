package chapter11;


interface A{
    void show();
    void config();
}
class B implements A{
    @Override
    public void show() {
        System.out.println("in show ");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}
public class Interface {
    public static void main(String[] args) {
        B a = new B();
        a.show();
        a.config();
    }

}
