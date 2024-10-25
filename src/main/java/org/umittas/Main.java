package org.umittas;
import org.openjdk.jol.vm.VM;

public class Main {
    /**
     *
     * This sample will explain how Objects are instantiated
     * How they are pointing to memory location
     * and how you should not assign 1 object ot another.
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        //Step1: create object instances from Class with overloaded constructors
        Rectangle r1 = new Rectangle("R1",90,45);
        Rectangle r2 = new Rectangle("R2");



        //Step2: Learn Memory locations and make sure they are unique objects
        System.out.println( "\n Step2: Learn Memory locations and make sure they are unique objects");
        System.out.println("-------------------------------------------------------------------");

        r1.setMemoryAddress(VM.current().addressOf(r1));
        r2.setMemoryAddress(VM.current().addressOf(r2));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("-------------------------------------------------------------------");

        //Step3: Try to assign 1 object to other!
        //This will break reference of r1 and
        // Memory location of r1 no longer accessible
        //Now Both pointing to r2 memory location which is problematic.
        r1= r2;

        System.out.println("\n Step3: Try to assign 1 object to other!");
        System.out.println("------------------------------------------");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("------------------------------------------");


        //Step4: Now change r1.length to 999 and observe what is happening!
        System.out.println("\n Step4: Now change r1.length to 999 value and observe what is happening!");
        System.out.println("---------------------------------------------------------");
        r1.setLength(999);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("---------------------------------------------------------");


        /**
         * Proper action about assigning 1 variable to another is creating new instance
         * and implementation of clone() method from super class itself
         * This part is advance, Don't worry about this until you need it.
         * Step1: Required class needs to implement Cloneable() interface
         * Step2: clone() method implementation needs to be done in mentioned class
         * Step3: new object instance needs to be created with .clone() method with the object intended to clone.
         */

        //Step5: Proper way of copying object is clone() implementation
        System.out.println("/nStep: Proper way of copying object is clone() implementation");
        System.out.println("--------------------------------------------------------------");

        //Create new object with clone() and give the object to be cloned.
        Rectangle newR = (Rectangle)r2.clone();

        newR.setMemoryAddress(VM.current().addressOf(newR));
        r2.setMemoryAddress(VM.current().addressOf(r2));

        System.out.println(newR);
        System.out.println(r2);
        System.out.println("--------------------------------------------------------------");

        //Step6: Change NewR length to 555 and name to newR, r2.length to 1 and see the result
        System.out.println("\n Step6: Change NewR length to 555 and name to newR, r2.length to 1 and see the result");
        System.out.println("------------------------------------------------------------------------------------");
        newR.setName("newR");
        newR.setLength(555);
        r2.setLength(1);
        System.out.println(newR);
        System.out.println(r2);
        System.out.println("------------------------------------------------------------------------------------");
    }
}