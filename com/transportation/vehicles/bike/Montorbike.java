package com.transportation.vehicles.bike;

import com.transportation.vehicles.Vehicle;

import java.util.Scanner;

public class Montorbike extends Vehicle {
    public String engineType;
    public double Weight;

    public Montorbike() {
    }

    public Montorbike(String id, String name, int year, double price, String engineType, double weight) {
        super(id, name, year, price);
        this.engineType = engineType;
        Weight = weight;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    public void display() {
        System.out.printf("Car{id: %s, name: %s, year: %d, price: %.2f, engineType: %s, brand: %.2f}\n", id, name, year, price, engineType, Weight);

    }

    @Override
    public void input(Scanner sc) {
        System.out.println("input id: ");
        this.id = sc.nextLine();
        System.out.println("input name: ");
        this.name = sc.nextLine();
        System.out.println("input year: ");
        this.year = sc.nextInt();
        System.out.println("input price: ");
        this.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("input engineType: ");
        this.engineType = sc.nextLine();
        System.out.println("input weight: ");
        this.Weight = sc.nextDouble();
    }
}
