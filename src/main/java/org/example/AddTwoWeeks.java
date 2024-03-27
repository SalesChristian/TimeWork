package org.example;
import java.time.LocalDateTime;

public class AddTwoWeeks {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime newDateTime = currentDateTime.plusWeeks(2);
        System.out.println("Datum nach Hinzufügen von 2 Wochen: " + newDateTime);
    }
}
