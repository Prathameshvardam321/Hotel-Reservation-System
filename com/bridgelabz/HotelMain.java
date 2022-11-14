package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {
    ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    void generateData(int weekdays, int weekend) {
        Hotel lakeWood = new Hotel("LakeWood", 110, 90, 3);
        lakeWood.expenseOfHotel(weekdays, weekend);
        Hotel bridgeWood = new Hotel("BridgeWood", 110, 80, 4);
        Hotel ridgeWood = new Hotel("RidgeWood", 150, 220, 4);
        hotelArrayList.add(lakeWood);
        hotelArrayList.add(ridgeWood);
        hotelArrayList.add(bridgeWood);
        Hotel cheaperRate = hotelArrayList.stream().reduce(bridgeWood, (a, b) -> a.expenseOfHotel(weekdays, weekend) < b.expenseOfHotel(weekdays, weekend) ? a : b);
        System.out.println(cheaperRate + " with total expense " + cheaperRate.expenseOfHotel(weekdays, weekend));
       System.out.println(bridgeWood.expenseOfHotel(weekdays,weekend));
       System.out.println(lakeWood.expenseOfHotel(weekdays,weekend));
       System.out.println(ridgeWood.expenseOfHotel(weekdays,weekend));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting date : ");
        String dateEntry = scanner.next();
        System.out.println("Enter ending date : ");
        String exitDate = scanner.next();
        long weekDays = Week.getWeekdays(dateEntry,exitDate);
        long weekendDays = Week.getWeekends(dateEntry,exitDate);
        HotelMain hotelMain = new HotelMain();
        hotelMain.generateData((int) weekDays, (int) weekendDays);

    }
}
