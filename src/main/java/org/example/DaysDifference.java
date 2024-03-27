package org.example;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DaysDifference {
    public static void main(String[] args) {
        LocalDate arbitraryDate1 = LocalDate.of(2024, Month.MARCH, 15);
        LocalDate arbitraryDate2 = LocalDate.of(2024, Month.MARCH, 25);
        long daysDifference = ChronoUnit.DAYS.between(arbitraryDate1, arbitraryDate2);
        System.out.println("Unterschied in Tagen zwischen " + arbitraryDate1 + " und " + arbitraryDate2 + ": " + daysDifference + " Tage.");
    }
}
