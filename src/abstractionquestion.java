abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("sleeping ");
    }
}

class cat extends Animal{

    @Override
    void sound() {
        System.out.println("mauuuuuuuuuu");
    }
}


public class abstractionquestion {
    Animal a = new cat();
}
