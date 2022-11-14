package com.bridgelabz;

public class Hotel {
    private String name;
    private int weekDayRateForRegularCustomer;
    private int weekeendRatesForRegularCustomer;
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
    int expenseOfHotel(int weekdays,int weekend){
        int expense = weekdays*weekDayRateForRegularCustomer+weekend*weekeendRatesForRegularCustomer;
        return expense;
    }
}
