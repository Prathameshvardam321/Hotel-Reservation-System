package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
    ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    private String name;
    private int weekDayRateForRegularCustomer;
    private int weekeendRatesForRegularCustomer;
    private double rating;
    private int totalExpense;

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }

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

    public void setRating(double rating) {
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

    @Override
    public String toString() {
        return " Hotel { " +
                "name='" + name + '\'' +
                ", weekDayRateForRegularCustomer=" + weekDayRateForRegularCustomer +
                ", weekendRatesForRegularCustomer=" + weekeendRatesForRegularCustomer +" , totalExpense "+totalExpense+ '}';
    }

    void inputToHotel(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter hotel name : ");
     this.name = scanner.next();
     System.out.println("weekdays rate : ");
     this.weekDayRateForRegularCustomer = scanner.nextInt();
     System.out.println("weekend days rate : ");
     this.weekeendRatesForRegularCustomer = scanner.nextInt();
        System.out.println("Enter hotel rating : ");
        this.setRating(scanner.nextDouble());
 }
}
