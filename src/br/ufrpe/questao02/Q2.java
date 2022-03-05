package br.ufrpe.questao02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {
        LocalDate dateFromUser = getDateFromUser();
        System.out.println("Days from now until the date you typed: " + daysFromDateToDate(LocalDate.now(), dateFromUser));
        System.out.println("New date plus 110 days: " + sumDaysToDate(110, dateFromUser));
        System.out.println("New date with month changed to August: " + changeDateToMonth(dateFromUser, Month.AUGUST));
        System.out.println("New date in dd-mmm-aaaa: " + getDateInBrFormat(dateFromUser));

        System.out.println("Let's try to find the week days between two dates.");
        System.out.println("Type the date one: ");
        LocalDate date1 = getDateFromUser();
        System.out.println("Type the date two: ");
        LocalDate date2 = getDateFromUser();
        System.out.println("Week days between " + getDateInBrFormat(date1) + " and " + getDateInBrFormat(date2) + " are " + weekDaysBetweenDates(date1, date2) + " in total");
    }

    public static LocalDate getDateFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the day: ");
        int day = scanner.nextInt();
        System.out.println("Insert the month: ");
        int month = scanner.nextInt();
        System.out.println("Insert the year: ");
        int year = scanner.nextInt();
        LocalDate resultDate = LocalDate.of(year, month, day);
        return resultDate;
    }

    public static long daysFromDateToDate(LocalDate date1, LocalDate date2){
        return ChronoUnit.DAYS.between(date1, date2);
    }

    public static LocalDate sumDaysToDate(int days, LocalDate date){
        return date.plusDays(days);
    }

    public static String getDateInBrFormat(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        return date.format(formatter);
    }

    public static LocalDate changeDateToMonth(LocalDate date, Month month) {
        return date.withMonth(month.getValue());
    }

    public static long weekDaysBetweenDates(LocalDate date1, LocalDate date2) {
        long days = daysFromDateToDate(date1, date2);
        long weekDays = 0;
        for(long i = 0; i <= days; i++){
            if(date1.plusDays(i).getDayOfWeek() != DayOfWeek.SATURDAY && date1.plusDays(i).getDayOfWeek() != DayOfWeek.SUNDAY){
                weekDays++;
            };
        }
        return weekDays;
    }
}
