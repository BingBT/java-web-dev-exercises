package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
        //Declare class variables here



        //Create Constructors here
        public Area() {


    }

    // Create other methods here
        public void calculateArea() {
            //ask for the radius
        Scanner input = new Scanner(System.in);
        Double myUsersRadius = input.nextDouble();

        //Calculate the area
        //Area = pi * radius * radius
        Double area = 3.14 * myUsersRadius * myUsersRadius;

        //Print the result
        System.out.println(area);
        }

}
