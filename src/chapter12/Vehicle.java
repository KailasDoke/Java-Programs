package chapter12;

public abstract class Vehicle {

    private int noOftirs;
    Vehicle(){
       this. noOftirs = 0;
    }
    Vehicle(int noOftirs){

        this.noOftirs = noOftirs;
    }

    public int getNoOftirs(){
        return this.noOftirs;
    }
  abstract void  start();


}
