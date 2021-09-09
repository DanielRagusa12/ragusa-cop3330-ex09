package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static final double gallon=350;
    public static void main( String[] args )
    {
        int length;
        int width;

        System.out.print("Length? ");

        Scanner input=new Scanner(System.in);
        length=input.nextInt();

        System.out.print("Width? ");

        Scanner input2=new Scanner(System.in);
        width=input2.nextInt();

        int area=length*width;

        int roundedGallons = (int)Math.ceil(area/gallon);


        System.out.print("You will need to purchase " +(roundedGallons)+ " gallons of paint to cover " +(area)+ " square feet.");



    }
}
