package com.bridgelabz;
import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelList hotelList = new HotelList();
        System.out.println("Enter weekday rate for lakewood ");
        int weekRate1 = scanner.nextInt();
        System.out.println("Enter weekend rate for lakewood ");
        int weekend1 = scanner.nextInt();
        hotelList.setDataForLakewood(weekRate1,weekend1);
        System.out.println("Enter weekday rate for brigewood ");
        int weekRate2 = scanner.nextInt();
        System.out.println("Enter weekend rate for brigewood ");
        int weekend2 = scanner.nextInt();
        hotelList.setDataBridgeWood(weekRate2,weekend2);
        System.out.println("Enter weekday rate for ridgewood ");
        int weekRate3 = scanner.nextInt();
        System.out.println("Enter weekend rate for ridgewood ");
        int weekend3 = scanner.nextInt();
        hotelList.setDataRidgewood(weekRate3,weekend3);
       hotelList.print();
    }
}
