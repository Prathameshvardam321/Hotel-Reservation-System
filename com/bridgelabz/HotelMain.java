package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelMain {
    ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week week = new Week();
        ArrayList<Hotel> hotels = new ArrayList<>();
        System.out.println("Enter entry date : ");
        String entryDate = scanner.next();
        System.out.println("Entry exit date : ");
        String exitDate = scanner.next();
        int weekDays = (int) week.getWeekdays(entryDate,exitDate);
        int weekend = (int) week.getWeekends(entryDate,exitDate);
        int userChoice ;
        do {
            System.out.println("1.Add Details\t2.Add rating\t3.view");
            System.out.println("Enter choice : ");
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 1:Hotel hotel =new Hotel();
                       hotel.inputToHotel();
                       hotel.setTotalExpense( hotel.expenseOfHotel(weekDays,weekend));
                       hotels.add(hotel);
                       break;
                case 2:
                  Hotel firstHotel = hotels.get(0);
                   Hotel cheaperHotel = hotels.stream().reduce(firstHotel,(a,b)->a.getTotalExpense()<b.getTotalExpense()&&a.getRating()> b.getRating()?a:b);
                    System.out.println(cheaperHotel.getName()+" is cheaper hotel with rate : "+cheaperHotel.getTotalExpense()+" with rating "+cheaperHotel.getRating());
                    break;
                case 3:
                    Iterator<Hotel> iterator = hotels.iterator();
                    while (iterator.hasNext()){
                        hotel = iterator.next();
                        System.out.println(hotel);
                    }
                    break;
                default:
                    System.out.println("Enter valid inputs .");
            }
        }while (userChoice!=0);
    }
}
