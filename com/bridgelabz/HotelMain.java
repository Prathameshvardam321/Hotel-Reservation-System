package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {
    ArrayList<Hotel> arrayList = new ArrayList<>();
     void generateData(int weekDays, int weekendDays) {
     arrayList.add(new Hotel("Lakewood",130,140,3));
     arrayList.add(new Hotel("Ridgewood",140,150,4));
     arrayList.add(new Hotel("Bridgewood",150,140,4));
    Hotel cheapestHotel = arrayList.stream().reduce(arrayList.get(0),(a,b)->a.expenseOfHotel(weekDays,weekendDays)<b.expenseOfHotel(weekDays,weekendDays)?a:b);
         System.out.println(cheapestHotel);
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
