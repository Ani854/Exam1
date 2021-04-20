package model;

public class Taxi {
    private String model;
    private String country;
    private int year;
    private int millage;
    private boolean isSport;
    private int weight;
    private int topSpeed;
    private int seats;
    private double cost;

    public void printInfo(){
        System.out.printf("Model: %s,", model);
        System.out.printf("country: %s,",country);
        System.out.printf("year: %d,",year);
        System.out.printf("millage: %d,",millage);
        System.out.printf("isSport: %s,",isSport ? "Yes" : "No");
        System.out.printf("weight: %d,",weight);
        System.out.printf("topSpeed: %d,",topSpeed);
        System.out.printf("seats: %d,",seats);
        System.out.printf("cost: %.1f,",cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() == 0) {
            System.out.println("Model can not be empty.");
        } else {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() == 0) {
            System.out.println("Country can not be empty.");
        } else {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1903 || year > 2020) {
            System.out.println("Year must be in 1903-2020.");
        } else {
            this.year = year;
        }
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        if (millage < 0 || millage > 999999) {
            System.out.println("Millage must be in 0-999999.");
        } else {
            this.millage = millage;
        }
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 1000 || year > 3000) {
            System.out.println("Weight must be in 1000-3000.");
        } else {
            this.weight = weight;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed < 0) {
            System.out.println("Top speed must be positive.");
        } else {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats < 0) {
            System.out.println("Seats must be positive.");
        } else {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            System.out.println("Cost must be positive.");
        } else {
            this.cost = cost;
        }
    }

    public Taxi(String model, String country, int year, int millage) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.millage = millage;
    }
}
