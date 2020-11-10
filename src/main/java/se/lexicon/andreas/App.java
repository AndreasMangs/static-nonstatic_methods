package se.lexicon.andreas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Access in a static way
        Car.staticMethod();
        //Car.counter = 15;

        //Access in a NON static way (instanced)
        Car object1 = new Car();
        object1.notAStaticMethod();

        object1.name = "Miles";
        object1.brand = "Volvo";

        //object1.counter = 12;


        System.out.println("object1.getId() = " + object1.getId());

        System.out.println("object1.getCounter() = " + Car.getCounter());

        new Car();
        new Car();
        new Car();
        System.out.println("object1.getCounter() = " + Car.getCounter());
        new Car();
        new Car();

        Car object2 = new Car();
        System.out.println("object2.getId() =" + object2.getId());
        System.out.println("object2.getCounter() =" + Car.getCounter());

        object2.brand = "BMW";

        System.out.println("object1.brand " + object1.brand);
        System.out.println("object2.brand " + object2.brand);

    }
}
