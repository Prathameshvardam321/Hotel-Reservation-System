package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week week = new Week();
        ArrayList<Hotel> hotelsForNormalCustomer = new ArrayList<>();
        ArrayList<Hotel> hotelsForRewardCustomer = new ArrayList<>();
        System.out.println("Enter entry date : ");
        String entryDate = scanner.next();
        System.out.println("Entry exit date : ");
        String exitDate = scanner.next();
        int weekDays = (int) week.getWeekdays(entryDate,exitDate);
        int weekend = (int) week.getWeekends(entryDate,exitDate);
        int userChoice ;
        do {
            System.out.println("1.Add Hotels\n2.view Hotels \n3.Best rated cheapest hotel");
            System.out.println("Enter choice : ");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    Hotel hotel = new Hotel();
                    System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    int customerType = scanner.nextInt();
                    if (customerType == 1) {
                        hotel.inputToHotelToCustomer();
                        hotel.setTotalExpense(hotel.expenseOfHotel(weekDays, weekend));
                        hotelsForNormalCustomer.add(hotel);
                    } else if (customerType == 2) {
                        hotel.inputToRewardCustomers();
                        hotel.expenseOfHotelForRewardCustomer(weekDays,weekend);
                        hotelsForRewardCustomer.add(hotel);
                    } else {
                        System.out.println("Enter valid input.");
                    }
                    break;

                case 2:
                    System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    customerType = scanner.nextInt();
                    if (customerType == 1) {
                        Iterator<Hotel> iterator = hotelsForNormalCustomer.iterator();
                        while (iterator.hasNext()) {
                            hotel = iterator.next();
                            System.out.println(hotel);
                        }
                    } else if (customerType == 2) {
                        Iterator<Hotel> iterator = hotelsForRewardCustomer.iterator();
                        while (iterator.hasNext()) {
                            hotel = iterator.next();
                            hotel.printDetailsForRewardCustomer();
                        }
                    }
                    break;
                case 3:
                    System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    customerType = scanner.nextInt();
                    if (customerType == 1) {
                        Hotel firstHotel = hotelsForNormalCustomer.get(0);
                        Hotel hotelCheapest = hotelsForRewardCustomer.stream().reduce(firstHotel, (a, b) -> a.expenseOfHotel(weekDays, weekend) < b.expenseOfHotel(weekDays, weekend) && a.getRating() >= b.getRating() ? a : b);
                        System.out.println(hotelCheapest);
                    } else if (customerType==2) {
                        Hotel firstHotel = hotelsForRewardCustomer.get(0);
                        Hotel hotelCheapest = hotelsForRewardCustomer.stream().reduce(firstHotel, (a, b) -> a.expenseOfHotel(weekDays, weekend) < b.expenseOfHotel(weekDays, weekend) && a.getRating() >= b.getRating() ? a : b);
                        hotelCheapest.printDetailsForRewardCustomer();
                    }else {
                        System.out.println("Enter valid details.");
                    }
                default:
                    System.out.println("Enter valid inputs .");
            }
        }while (userChoice!=0);
    }
}
