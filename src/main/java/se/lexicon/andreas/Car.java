package se.lexicon.andreas;

public class Car {

    //
    static int counter =0;

    //Instance field or members
    int id;
    String name;
    String brand;
    String reg_number;

    public Car(){
        this.id = ++counter;
    }

    public static void staticMethod(){
    }

    public void notAStaticMethod(){
    }

    public static int getCounter(){
        return counter;
    }

    public int getId(){
        return this.id;
    }
}
