package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // first output formatter
        DateTimeFormatter usStandardFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String firstOutput = now.format(usStandardFormat);

        // second output formatter
        DateTimeFormatter javaStandardFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String secondOutput = now.format(javaStandardFormat);

        // third output formatter
        DateTimeFormatter thirdOutputFormat = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        String thirdOutput = now.format(thirdOutputFormat);

        // fourth output formatter
        DateTimeFormatter fourthOutputFormat = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        String fourthOutput = now.format(fourthOutputFormat);

        // challenge output formatter
        DateTimeFormatter challengeOutputFormat = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        String challengeOutput = now.format(challengeOutputFormat);

        System.out.println(firstOutput);
        System.out.println(secondOutput);
        System.out.println(thirdOutput);
        System.out.println(fourthOutput);
        System.out.println(challengeOutput);

    }
}
