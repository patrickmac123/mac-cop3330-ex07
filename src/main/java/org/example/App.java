package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 7 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? " );
        String stringLength = scan.nextLine();
        System.out.print( "What is the width of the room in feet? " );
        String stringWidth = scan.nextLine();
        double length=Double.parseDouble(stringLength);
        double width=Double.parseDouble(stringWidth);
        double f2 = length * width;
        double m2 = f2 * 0.09290304;
        System.out.println("You entered dimensions of "+stringLength+" feet by "+stringWidth+" feet.");
        System.out.println("The area is");
        System.out.println(f2+" square feet");
        System.out.println(m2+" square meters");
    }
}