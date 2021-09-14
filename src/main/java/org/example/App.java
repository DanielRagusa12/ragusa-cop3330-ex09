package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static final double gallon=350;
    public static void main( String[] args )
    {
        int length;
        int width;
        Scanner input=new Scanner(System.in);

        System.out.print("Length? ");
        length=input.nextInt();

        System.out.print("Width? ");
        width=input.nextInt();

        int area=length*width;

        double roundedGallons = (int)Math.ceil(area/gallon);


        System.out.print("You will need to purchase " +(int)(roundedGallons)+ " gallons of paint to cover " +(area)+ " square feet.");

    }
}
