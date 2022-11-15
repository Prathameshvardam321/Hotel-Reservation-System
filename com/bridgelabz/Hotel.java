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
    private int weekDayRateForRewardCustomer;

    public int getWeekeendRatesForRegularCustomer() {
        return weekeendRatesForRegularCustomer;
    }

    public void setWeekeendRatesForRegularCustomer(int weekeendRatesForRegularCustomer) {
        this.weekeendRatesForRegularCustomer = weekeendRatesForRegularCustomer;
    }

    public int getWeekDayRateForRewardCustomer() {
        return weekDayRateForRewardCustomer;
    }

    public void setWeekDayRateForRewardCustomer(int weekDayRateForRewardCustomer) {
        this.weekDayRateForRewardCustomer = weekDayRateForRewardCustomer;
    }

    public int getWeekendRateForRewardCustomer() {
        return weekendRateForRewardCustomer;
    }

    public void setWeekendRateForRewardCustomer(int weekendRateForRewardCustomer) {
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    private int weekendRateForRewardCustomer;
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

    public double getRating() {
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
    int expenseOfHotelForRewardCustomer(int weekdays,int weekend){
        int expense = weekdays*weekDayRateForRewardCustomer+weekend*weekendRateForRewardCustomer;
        return expense;
    }

    @Override
    public String toString() {
        return " Hotel { " +
                "name='" + name + '\'' +
                ", weekDayRateForRegularCustomer=" + weekDayRateForRegularCustomer +
                ", weekendRatesForRegularCustomer=" + weekeendRatesForRegularCustomer +" , totalExpense "+totalExpense+ " ,rating "+rating+'}';
    }

    void inputToHotelToCustomer(){
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
 void inputToRewardCustomers(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter hotel name : ");
         this.name = scanner.next();
        System.out.println("Enter weekday rate : ");
        weekDayRateForRewardCustomer = scanner.nextInt();
        System.out.println("Enter weekend rate :");
        weekendRateForRewardCustomer = scanner.nextInt();
        System.out.println("Enter hotel rating : ");
        this.setRating(scanner.nextDouble());
    }
    void printDetailsForRewardCustomer(){
        System.out.println( "' name '=" + name + '\'' + ", weekDayRateForRewardCustomer=" + weekDayRateForRewardCustomer + ", weekendRatesForRewardCustomer=" + weekendRateForRewardCustomer +" , totalExpense "+totalExpense+ " ,rating "+rating);
    }

}
