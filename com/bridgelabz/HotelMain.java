package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        ArrayList<Hotel> hotels = new ArrayList<>();
        int userChoice ;
        do {
            System.out.println("1.Add Details\t2.Add rating\t3.view");
            System.out.println("Enter choice : ");
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 1:Hotel hotel =new Hotel();
                       hotel.inputToHotel();
                       hotels.add(hotel);break;
                case 2:
                    System.out.println("Enter hotel name to enter :");
                    String name = stringScanner.next();
                    Iterator<Hotel> iterator = hotels.iterator();
                    while (iterator.hasNext()){
                        hotel = iterator.next();
                        if (hotel.getName().equals(name)){
                            System.out.println("Enter rating : ");
                            hotel.setRating(scanner.nextInt());
                            System.out.println("Added successfully");
                        }
                    }
                    break;
                case 3:
                    iterator = hotels.iterator();
                    while (iterator.hasNext()){
                        hotel = iterator.next();
                        System.out.println(hotel);
                    }
                    break;
            }

        }while (userChoice!=0);
    }
}
