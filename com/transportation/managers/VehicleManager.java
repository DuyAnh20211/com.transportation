package com.transportation.managers;

import com.transportation.vehicles.bike.Montorbike;
import com.transportation.vehicles.car.Car;

import java.util.*;

public class VehicleManager {
    private List<Car> cars;
    private List<Montorbike> montorbikes;

    public VehicleManager() {
        cars = new ArrayList<>();
        montorbikes = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Montorbike> getMontorbikes() {
        return montorbikes;
    }

    public void setMontorbikes(List<Montorbike> montorbikes) {
        this.montorbikes = montorbikes;
    }

    public void inputCars(Scanner sc) {
        System.out.println("input n cars: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Car car = new Car();
            System.out.println("input cars " + (i + 1));
            car.input(sc);
            cars.add(car);
        }
    }

    public void inputBikes(Scanner sc) {
        System.out.println("input n montorbikes: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Montorbike montorbike = new Montorbike();
            System.out.println("input montorbike " + (1 + i) + ": ");
            montorbike.input(sc);
            montorbikes.add(montorbike);
        }
    }

    public void displayCarsSortedByPriceDesc() {
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).display();
        }
    }

    public void filterBikesByEngineType(String engineType) {
        for (Montorbike montorbike : montorbikes) {
            if (montorbike.getEngineType().equals(engineType)) {
                montorbike.display();
            }
        }
    }
}
