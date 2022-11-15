package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelMain {
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
            System.out.println("1.Add Hotels\n2.view Hotels \n3.Best rated cheapest hotel\n4.Best rated hotel");
            System.out.println("Enter choice : ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    Hotel hotel = new Hotel();
                    try {
                        hotel.inputToHotelToCustomer();
                    }catch (ValidationException e){
                        System.out.println(e);
                    }
                    hotel.expenseOfHotelForRewardCustomer(weekDays,weekend);
                    hotels.add(hotel);
                    break;

                case 2:
                    System.out.println("List of all hotels is as below : ");
                    hotels.stream().forEach(x-> System.out.println(x));
                    break;
                case 3:int customerType;
                    System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    customerType = scanner.nextInt();
                    if (customerType == 1) {
                        Hotel firstHotel = hotels.get(0);
                        Hotel hotelCheapest = hotels.stream().reduce(firstHotel, (a, b) -> a.expenseOfHotel(weekDays, weekend) < b.expenseOfHotel(weekDays, weekend) && a.getRating() >= b.getRating() ? a : b);
                        System.out.println(hotelCheapest.getName()+" | "+hotelCheapest.expenseOfHotel(weekDays, weekend));
                    } else if (customerType==2) {
                        Hotel firstHotel = hotels.get(0);
                        Hotel hotelCheapest = hotels.stream().reduce(firstHotel, (a, b) -> a.expenseOfHotelForRewardCustomer(weekDays, weekend) < b.expenseOfHotelForRewardCustomer(weekDays, weekend) && a.getRating() >= b.getRating() ? a : b);
                        System.out.println(hotelCheapest.getName()+" | "+hotelCheapest.expenseOfHotelForRewardCustomer(weekDays, weekend));
                    }else {
                        System.out.println("Enter valid details.");
                    }
                case 4:
                    System.out.println("Best rated hotels are :");
                    Hotel firstHotel = hotels.get(0);
                    Hotel bestRatedHotel = hotels.stream().reduce(firstHotel,(a,b)->a.getRating()>b.getRating()?a:b);
                    hotels.stream().filter(a->a.getRating()==bestRatedHotel.getRating()).forEach(x-> System.out.println(x));
                default:
                    System.out.println("Enter valid inputs .");
            }
        }while (userChoice!=0);
    }
}
