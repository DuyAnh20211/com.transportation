package com.transportation.main;

import com.transportation.managers.VehicleManager;
import com.transportation.vehicles.bike.Montorbike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Car cars = new Car();
//        cars.input(sc);
//        cars.display();
//
//        Montorbike bikes = new Montorbike();
//        bikes.input(sc);
//        bikes.display();

        int choice;
        VehicleManager vehicleManagers = new VehicleManager();
        do {
            System.out.println("==== VEHICLE MANAGEMENT MENU ====");
            System.out.println("1.Input Cars");
            System.out.println("2.Input Montorbikes");
            System.out.println("3.Display All Cars (Sorted by Price DESC)");
            System.out.println("4.Display Motorbikes (Filter by Engine Type)");
            System.out.println("5.Exit");

            System.out.println("input choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    vehicleManagers.inputCars(sc);
                    break;
                case 2:
                    vehicleManagers.inputBikes(sc);
                    break;
                case 3:
                    vehicleManagers.displayCarsSortedByPriceDesc();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Input search engineType: ");
                    String engineType = sc.nextLine();
                    vehicleManagers.filterBikesByEngineType(engineType);
                    break;
                case 5:
                    System.out.println("Out app");
                    break;
                default:
                    System.out.println("Ko có choice này: ");
                    break;
            }
        } while (choice != 5);
    }
}
