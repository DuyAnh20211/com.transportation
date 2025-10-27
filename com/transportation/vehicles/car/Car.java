package com.transportation.vehicles.car;

import com.transportation.vehicles.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    public int seatCount;
    public String Brand;

    public Car() {
    }

    public Car(String id, String name, int year, double price, int seatCount, String brand) {
        super(id, name, year, price);
        this.seatCount = seatCount;
        Brand = brand;
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

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
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
        System.out.println("input count: ");
        this.seatCount = sc.nextInt();
        sc.nextLine();
        System.out.println("input brand: ");
        this.Brand = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.printf("Car{id: %s, name: %s, year: %d, price: %.2f, seatCount: %d, brand: %s}\n", id, name, year, price, seatCount, Brand);
    }
}
