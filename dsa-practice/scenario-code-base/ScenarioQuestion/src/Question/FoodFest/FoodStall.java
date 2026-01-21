package Question.FoodFest;

public class FoodStall {
    String stallName;
    int footfall;
    String zone;

    public FoodStall(String stallName, int footfall, String zone) {
        this.stallName = stallName;
        this.footfall = footfall;
        this.zone = zone;
    }

    @Override
    public String toString() {
        return stallName + " | Zone: " + zone + " | Footfall: " + footfall;
    }
}
