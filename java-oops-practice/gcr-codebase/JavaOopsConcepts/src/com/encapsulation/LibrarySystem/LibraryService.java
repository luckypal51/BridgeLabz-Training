package com.encapsulation.LibrarySystem;

import java.util.*;

class LibraryService {

    public static void manageItems(List<LibraryItem> items) {

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println("----------------------------");
        }
    }
}
