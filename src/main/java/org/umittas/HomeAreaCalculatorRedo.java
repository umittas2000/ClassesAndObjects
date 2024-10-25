package org.umittas;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
    }

    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the lenth of your room");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the widhth of your room");
        Rectangle room = new Rectangle();

        return room;
    }
}
