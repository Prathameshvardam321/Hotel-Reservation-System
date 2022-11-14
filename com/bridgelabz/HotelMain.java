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
                   Hotel bestRatedHotel = hotels.stream().reduce(firstHotel,(a,b)->a.getRating()> b.getRating()?a:b);
                   double bestRating = bestRatedHotel.getRating();
                    System.out.println("Hotels with best ratings are as followed : ");
                   hotels.stream().filter(x->x.getRating()==bestRating).forEach(x-> System.out.println(x));
//                    System.out.println(bestRatedHotel.getName()+" is best rated hotel with rating : "+bestRatedHotel.getRating()+" with total expenses "+bestRatedHotel.getTotalExpense());
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
