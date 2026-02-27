package chapter7;

import java.lang.reflect.Constructor;

public class constructor {
    String name;
    float age;


    constructor()
    {

        System.out.println("automaticall called ");
    }

     constructor(String a){    /// ARGUMENTED CONSTRUCTOR
        name = a;
        age = 21;
         System.out.println(name);

    }
    public void display(){
        System.out.println("my intro ");
    }

    public static void main(String[] args){
        constructor c = new constructor("Kailas");

    }
}
