package com.bridgelabz;

import java.util.ArrayList;

public class HotelList {
    static ArrayList<Hotel> hotels = new ArrayList<>();

    public void addData(int weekdays,int weekend){
        Hotel lakeWood = new Hotel();
        lakeWood.setName("LakeWood");
        lakeWood.setWeekDayRateForRegularCustomer(110);
        lakeWood.setWeekendRatesForRegularCustomer(90);
        lakeWood.expenseOfHotel(weekdays,weekend);
        Hotel bridgeWood = new Hotel();
        bridgeWood.setName("BridgeWood");
        bridgeWood.setWeekDayRateForRegularCustomer(110);
        bridgeWood.setWeekendRatesForRegularCustomer(80);
        Hotel ridgeWood = new Hotel();
        ridgeWood.setName("RidgeWood");
        ridgeWood.setWeekendRatesForRegularCustomer(150);
        ridgeWood.setWeekDayRateForRegularCustomer(220);
        bridgeWood.expenseOfHotel(weekdays,weekend);
        ridgeWood.expenseOfHotel(weekdays,weekend);
        lakeWood.expenseOfHotel(weekdays,weekend);
        hotels.add(bridgeWood);
        hotels.add(lakeWood);
        hotels.add(ridgeWood);
        int cheaperRate =   bridgeWood.expenseOfHotel(weekdays,weekend);
        if (cheaperRate<lakeWood.expenseOfHotel(weekdays,weekend)&&cheaperRate<ridgeWood.expenseOfHotel(weekdays,weekend)){
            System.out.println("bridgewood has cheaper rate : "+cheaperRate);
        }if (lakeWood.expenseOfHotel(weekdays,weekend)<cheaperRate&&lakeWood.expenseOfHotel(weekdays,weekend)<ridgeWood.expenseOfHotel(weekdays,weekend)){
            System.out.println("Lakewood has cheaper rate : "+lakeWood.expenseOfHotel(weekdays,weekend));
        }if (ridgeWood.expenseOfHotel(weekdays,weekend)<cheaperRate&&ridgeWood.expenseOfHotel(weekdays,weekend)<lakeWood.expenseOfHotel(weekdays,weekend)){
            System.out.println("Ridgewood has cheapest rate "+ridgeWood.expenseOfHotel(weekdays,weekend));
        }
    }
    int selectCheaperHotel(int weekday,int weekend){
        int cheapRates = 100000000;
        for (Hotel h : hotels){
            if ((h.expenseOfHotel(weekday,weekend))<cheapRates){
                cheapRates = (h.expenseOfHotel(weekday,weekend));
            }
        }
    return cheapRates;
    }
}
