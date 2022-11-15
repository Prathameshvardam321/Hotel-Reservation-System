package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week week = new Week();
        ArrayList<Hotel> hotelsForNormalCustomer = new ArrayList<>();
        ArrayList<Hotel> hotelsForRegularCustomer = new ArrayList<>();
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
            switch (userChoice){
                case 1:Hotel hotel =new Hotel();
                    System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    int customerType = scanner.nextInt();
                    if (customerType==1){
                        hotel.inputToHotelToCustomer();
                        hotel.setTotalExpense(hotel.expenseOfHotel(weekDays,weekend));
                        hotelsForNormalCustomer.add(hotel);
                    }else if(customerType==2) {
                        hotel.inputToRewardCustomers();
                        hotel.setTotalExpense(hotel.expenseOfHotel(weekDays,weekend));
                        hotelsForRegularCustomer.add(hotel);
                    }else {
                        System.out.println("Enter valid input.");
                    }
                       break;

                case 2:System.out.println("choose customer\n 1.Regular customer\n2.Reward customer  ");
                    customerType = scanner.nextInt();
                    if (customerType==1){
                        Iterator<Hotel> iterator =hotelsForNormalCustomer .iterator();
                    while (iterator.hasNext()){
                        hotel = iterator.next();
                        System.out.println(hotel);
                    }
                    }else if (customerType==2) {
                        Iterator<Hotel> iterator = hotelsForRegularCustomer.iterator();
                        while (iterator.hasNext()) {
                            hotel = iterator.next();
                            System.out.println(hotel);
                        }
                    }
                    break;
                case 3:
                    Hotel firstHotel = hotelsForRegularCustomer.get(0);
                    Hotel hotelCheapest = hotelsForRegularCustomer.stream().reduce(firstHotel,(a,b)->a.expenseOfHotel(weekDays,weekend)<b.expenseOfHotel(weekDays,weekend)&&a.getRating()>=b.getRating()?a:b);
                    System.out.println(hotelCheapest);
                default:
                    System.out.println("Enter valid inputs .");

            }
        }while (userChoice!=0);
    }
}
