package org.umittas;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();

        //Access object methods
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //Create 2nd instance and use another constructor method
        Rectangle room2 = new Rectangle("Room2",30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: "+ totalArea);
    }
}
