package com.encapsulation.LibrarySystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
