package org.example;
import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Aktuelles Datum und Uhrzeit: " + currentDateTime);
    }
}
