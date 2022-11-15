package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Hotel {
    static String hotelName = "^[a-z0-9\\s.A-Z]{1,}";
    static boolean validatePattern(String pattern, String input){
        return Pattern.matches(pattern,input);
    }
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
        return "Hotel{" +
                "name='" + name + '\'' +
                ", weekDayRateForRegularCustomer=" + weekDayRateForRegularCustomer +
                ", weekeendRatesForRegularCustomer=" + weekeendRatesForRegularCustomer +
                ", rating=" + rating +
                ", totalExpense=" + totalExpense +
                ", weekDayRateForRewardCustomer=" + weekDayRateForRewardCustomer +
                ", weekendRateForRewardCustomer=" + weekendRateForRewardCustomer +
                '}';
    }

    void inputToHotelToCustomer() throws ValidationException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hotel name : ");
        this.name = scanner.next();
        if (validatePattern(hotelName,this.name)){
            throw new ValidationException("Entered hotel name ");
        }
        System.out.println("Enter weekday rate : ");
        weekDayRateForRewardCustomer = scanner.nextInt();
        System.out.println("Enter weekend rate :");
        weekendRateForRewardCustomer = scanner.nextInt();
        System.out.println("Enter hotel rating : ");
        this.rating = scanner.nextDouble();
        System.out.println("Enter weekday rate for Reward customer : ");
        this.weekendRateForRewardCustomer = scanner.nextInt();
        System.out.println("Enter weekend rate for Reward customer :");
        this.weekendRateForRewardCustomer = scanner.nextInt();
 }


}
