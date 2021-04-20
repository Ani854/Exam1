package service;

import model.Taxi;

import java.util.Scanner;

public class TaxiService {
    public Taxi create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model");
        String model = s.next();
        System.out.println("Enter country");
        String country = s.next();
        System.out.println("Enter year");
        int year = s.nextInt();
        System.out.println("Enter millage");
        int millage = s.nextInt();
        System.out.println("Is sport .y/n");
        boolean sport = s.next().charAt(0) == 'y';
        System.out.println("Enter weight");
        int weight = s.nextInt();
        System.out.println("Enter top speed");
        int topSpeed = s.nextInt();
        System.out.println("Enter seats");
        int seats = s.nextInt();
        System.out.println("Enter cost");
        double cost = s.nextDouble();

        Taxi taxi = new Taxi(model, country, year, millage);
        taxi.setSport(sport);
        taxi.setWeight(weight);
        taxi.setTopSpeed(topSpeed);
        taxi.setSeats(seats);
        taxi.setCost(cost);
        return taxi;
    }

    public void task1(Taxi taxi) {
        if (taxi.isSport()) {
            System.out.println("Cost - " + taxi.getCost() + ", top speed - " + taxi.getTopSpeed());
        } else {
            System.out.println("Model - " + taxi.getModel() + ",country - " + taxi.getCountry());
        }
    }

    public Taxi task2(Taxi t1, Taxi t2) {
        return t1.getYear() >= t2.getYear() ? t1 : t2;
    }

    public void task3(Taxi t1, Taxi t2, Taxi t3) {
        Taxi smallest = t1;
        if (t1.getSeats() > t2.getSeats()) {
            smallest = t2;
        }
        if (smallest.getSeats() > t3.getSeats()) {
            smallest = t3;
        }
        System.out.println("Country" + smallest.getCountry());
    }

    public void task4(Taxi[] taxis) {
        for (Taxi taxi : taxis) {
            if (!taxi.isSport()) {
                taxi.printInfo();
                System.out.println("--------");
            }
        }
    }

    public void task5(Taxi[] taxis) {
        for (Taxi taxi : taxis) {
            if (taxi.isSport() && taxi.getMillage() > 50000) {
                taxi.printInfo();
            }
        }
    }

    public Taxi task6(Taxi[] taxis) {
        Taxi smallWeight = taxis[0];
        for (int i = 1; i < taxis.length; i++) {
            if (smallWeight.getWeight() > taxis[i].getWeight()) {
                smallWeight = taxis[i];
            }
        }
        return smallWeight;
    }

    public Taxi task7(Taxi[] taxis) {
        Taxi sportTaxi = null;
        for (int i = 0; i < taxis.length; i++) {
            if (sportTaxi == null) {
                if (taxis[i].isSport()) {
                    sportTaxi = taxis[i];
                }
                continue;
            }

            if (taxis[i].isSport() && taxis[i].getCost() < sportTaxi.getCost()) {
                sportTaxi = taxis[i];
            }
        }
        return sportTaxi;
    }

    public void task8(Taxi[] taxis) {
        boolean isActive = true;
        int count = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < taxis.length - 1 - count; i++) {
                if (taxis[i].getYear() > taxis[i + 1].getYear()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[i + 1];
                    taxis[i + 1] = temp;
                    isActive = true;
                }
            }
            count++;
        }
        for(Taxi taxi : taxis){
            taxi.printInfo();
            System.out.println("----------");
        }
    }
}
