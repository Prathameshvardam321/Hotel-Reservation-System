package com.bridgelabz;
import java.sql.Time;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting date : ");
        String dateEntry = scanner.next();
        System.out.println("Enter ending date : ");
        String exitDate = scanner.next();
        long weekDays = Week.getWeekdays(dateEntry,exitDate);
        long weekendDays = Week.getWeekends(dateEntry,exitDate);
        HotelList hotelList = new HotelList();
        hotelList.addData((int) weekDays,(int)weekendDays);

    }
}
