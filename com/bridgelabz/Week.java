package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week {
    static long getWeekends(String strStartDate, String strEndDate) {
        Map<String, List<LocalDate>> map = new HashMap<>();
        List<LocalDate> weekdays = new ArrayList<>();
        List<LocalDate> weekends = new ArrayList<>();
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
        return weekends.stream().count();
    }

    static long getWeekdays(String strStartDate, String strEndDate) {


            Map<String, List<LocalDate>> map = new HashMap<>();
            List<LocalDate> weekdays = new ArrayList<>();
            try {
            List<LocalDate> weekends = new ArrayList<>();
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

            return weekdays.stream().count();
        }catch (Exception e){
            return weekdays.stream().count();
        }

    }
}