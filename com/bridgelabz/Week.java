package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week {

    long getWeekends(String strStartDate, String strEndDate) {
            Map<String, List<LocalDate>> map = new HashMap<>();
            List<LocalDate> weekdays = new ArrayList<>();
            List<LocalDate> weekends = new ArrayList<>();
            try {
            map.put("weekdays", weekdays);
            map.put("weekends", weekends);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate startDate = LocalDate.parse(strStartDate, formatter);
            LocalDate enddDate = LocalDate.parse(strEndDate, formatter);

            for (LocalDate date = startDate; !date.isAfter(enddDate); date = date.plusDays(1)) {
                switch (date.getDayOfWeek()) {
                    case MONDAY:
                    case TUESDAY:
                    case WEDNESDAY:
                    case THURSDAY:
                    case FRIDAY:
                        weekdays.add(date);
                        break;
                    case SATURDAY:
                    case SUNDAY:
                        weekends.add(date);
                }
            }


        }catch (Exception e){
                System.out.println("Enter valid check in date.!!! ");
        return weekdays.stream().count();
        }
        return weekends.stream().count();
    }
     long getWeekdays(String strStartDate, String strEndDate) {
         Map<String, List<LocalDate>> map = new HashMap<>();
         List<LocalDate> weekdays = new ArrayList<>();
         List<LocalDate> weekends = new ArrayList<>();
         try {
             map.put("weekdays", weekdays);
             map.put("weekends", weekends);
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
             LocalDate startDate = LocalDate.parse(strStartDate, formatter);
             LocalDate enddDate = LocalDate.parse(strEndDate, formatter);
             for (LocalDate date = startDate; !date.isAfter(enddDate); date = date.plusDays(1)) {
                 switch (date.getDayOfWeek()) {
                     case MONDAY:
                     case TUESDAY:
                     case WEDNESDAY:
                     case THURSDAY:
                     case FRIDAY:
                         weekdays.add(date);
                         break;
                     case SATURDAY:
                     case SUNDAY:
                         weekends.add(date);
                 }
             }

         }catch (Exception e){
             System.out.println("Please enter valid checkout date !!!.");
         return weekdays.stream().count();
         }
         return weekdays.stream().count();
     }
}