package com.bridgelabz;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    private String name;
    private int weekDayRateForRegularCustomer;
    private int weekeendRatesForRegularCustomer;

    public Hotel() {
    }

    public Hotel(String name, int weekDayRateForRegularCustomer, int weekeendRatesForRegularCustomer, int rating) {
        this.name = name;
        this.weekDayRateForRegularCustomer = weekDayRateForRegularCustomer;
        this.weekeendRatesForRegularCustomer = weekeendRatesForRegularCustomer;
        this.rating = rating;
    }

    private int rating;

    public Hotel() {
    }

    public Hotel(String name, int weekDayRateForRegularCustomer, int weekeendRatesForRegularCustomer, int rating) {
        this.name = name;
        this.weekDayRateForRegularCustomer = weekDayRateForRegularCustomer;
        this.weekeendRatesForRegularCustomer = weekeendRatesForRegularCustomer;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekDayRateForRegularCustomer() {
        return weekDayRateForRegularCustomer;
    }

    public void setWeekDayRateForRegularCustomer(int weekeendRatesForRegularCustomer) {
        this.weekDayRateForRegularCustomer = weekeendRatesForRegularCustomer;
    }

    public int getWeekendRatesForRegularCustomer() {
        return weekeendRatesForRegularCustomer;
    }

    public void setWeekendRatesForRegularCustomer(int weekeendRatesForRegularCustomer) {
        this.weekeendRatesForRegularCustomer = weekeendRatesForRegularCustomer;
    }

    int expenseOfHotel(int weekdays, int weekend) {
        int expense = weekdays * weekDayRateForRegularCustomer + weekend * weekeendRatesForRegularCustomer;
        return expense;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", weekDayRateForRegularCustomer=" + weekDayRateForRegularCustomer +
                ", weekeendRatesForRegularCustomer=" + weekeendRatesForRegularCustomer +
                ", rating=" + rating +
                '}';
    }

    void inputToHotel(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter name : ");
     this.name = scanner.next();
     System.out.println("weekdays rate : ");
     this.weekDayRateForRegularCustomer = scanner.nextInt();
     System.out.println("weekend days rate : ");
     this.weekeendRatesForRegularCustomer = scanner.nextInt();
 }
}
