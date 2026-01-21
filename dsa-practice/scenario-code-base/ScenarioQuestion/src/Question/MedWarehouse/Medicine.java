package Question.MedWarehouse;

import java.time.LocalDate;

class Medicine {
    String name;
    LocalDate expiryDate;
    String branch;

    public Medicine(String name, LocalDate expiryDate, String branch) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate + " | Branch: " + branch;
    }
}
