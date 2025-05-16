package com.yourdreamcar.ui;


import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class UserInterface {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Choose from the following menu======");
        System.out.println(" 1 - Find vehicles within a price range\n" +
                "2 - Find vehicles by make / model\n" +
                "3 - Find vehicles by year range\n" +
                "4 - Find vehicles by color\n" +
                "5 - Find vehicles by mileage range\n" +
                "6 - Find vehicles by type (car, truck, SUV, van)\n" +
                "7 - List ALL vehicles\n" +
                "8 - Add a vehicle\n" +
                "9 - Remove a vehicle\n" +
                "99 - Quit");
        switch (choice) {
            case 1 -> processGetByPriceRequest();
            case 2 -> processGetByMakeModelRequest();
            case 3 -> processGetByYearRequest();
            case 4 -> processGetByColorRequest();
            case 5 -> processGetByMileageRequest();
            case 6 -> processGetByTypeRequest();
            case 7 -> processAllVehiclesRequest();
            case 8 -> processAddVehicleRequest();
            case 9 -> processRemoveVehicleRequest();
            case 99 -> System.out.println("Exiting");
            default -> System.out.println("Invalid input.");
        }



    }

}
