package org.example;
import java.time.LocalDateTime;
import java.time.Month;

public class CompareDates {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime futureDateTime = LocalDateTime.of(2024, Month.APRIL, 10, 0, 0);

        if (currentDateTime.isBefore(futureDateTime)) {
            System.out.println("Das aktuelle Datum liegt vor dem festgelegten zukünftigen Datum.");
        } else if (currentDateTime.isAfter(futureDateTime)) {
            System.out.println("Das aktuelle Datum liegt nach dem festgelegten zukünftigen Datum.");
        } else {
            System.out.println("Das aktuelle Datum ist dasselbe wie das festgelegte zukünftige Datum.");
        }
    }
}
