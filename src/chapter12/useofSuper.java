package chapter12;

class Animal{
    String Type;
    Animal(String Type ){
        System.out.println("Constructor of Parent class ");
    }
}

class Dog extends Animal{
    Dog(){
        super("Mamel");
        System.out.println("Dog class ");
    }
}


public class useofSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
