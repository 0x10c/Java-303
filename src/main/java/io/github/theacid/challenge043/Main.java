package io.github.theacid.challenge043;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

class StringToDate {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Type date ex. May 9, 1999: ");
        String dateToConvert = inputValue.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(dateToConvert, dateTimeFormatter);

        System.out.println(localDate);
    }
}