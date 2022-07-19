package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();

    }

    public void calculateMilesPerGallon() {

        Scanner input= new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas has your car consumed?");
        Double gallonsConsumed = input.nextDouble();

        Double milesPerGallon = milesDriven / gallonsConsumed;
        System.out.println("Your miles per gallon is: " + milesPerGallon.toString());
    }
}
