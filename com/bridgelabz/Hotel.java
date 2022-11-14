package com.bridgelabz;

import java.util.ArrayList;

public class Hotel {
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
}