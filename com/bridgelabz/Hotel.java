package com.bridgelabz;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    private String name;
    private int weekDayRateForRegularCustomer;
    private int weekeendRatesForRegularCustomer;
    private int totalExpense = weekDayRateForRegularCustomer*weekeendRatesForRegularCustomer;

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
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
    int expenseOfHotel(int weekdays,int weekend){
        int expense = weekdays*weekDayRateForRegularCustomer+weekend*weekeendRatesForRegularCustomer;
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
    void generateData(int weekdays,int weekend){
        Hotel lakeWood = new Hotel();
        lakeWood.setName("LakeWood");
        lakeWood.setWeekDayRateForRegularCustomer(110);
        lakeWood.setWeekendRatesForRegularCustomer(90);
        lakeWood.setRating(4);
        lakeWood.expenseOfHotel(weekdays,weekend);
        int expenseLake =lakeWood.expenseOfHotel(weekdays,weekend);
        Hotel bridgeWood = new Hotel();
        bridgeWood.setName("BridgeWood");
        bridgeWood.setWeekDayRateForRegularCustomer(110);
        bridgeWood.setWeekendRatesForRegularCustomer(80);
        bridgeWood.setRating(3);
        int expenseBridge = bridgeWood.expenseOfHotel(weekdays,weekend);
        Hotel ridgeWood = new Hotel();
        ridgeWood.setName("RidgeWood");
        ridgeWood.setWeekendRatesForRegularCustomer(150);
        ridgeWood.setWeekDayRateForRegularCustomer(220);
        ridgeWood.setRating(4);
        int expenseRidge = ridgeWood.expenseOfHotel(weekdays,weekend);
        int cheaperRate =hotelArrayList.stream().reduce(0,(a,b)->a.expenseOfHotel(weekdays,weekend)<b.expenseOfHotel(weekdays,weekend)?a:b);
    }
}
