package Question.FoodFest;

import java.util.ArrayList;
import java.util.List;

public class Main {
	   public static void main(String[] args) {

	       
	        List<FoodStall> zoneA = List.of(
	                new FoodStall("Burger Hub", 120, "Zone A"),
	                new FoodStall("Pizza Point", 200, "Zone A")
	        );

	        List<FoodStall> zoneB = List.of(
	                new FoodStall("Taco Town", 150, "Zone B"),
	                new FoodStall("Pasta Place", 200, "Zone B")
	        );

	        
	        List<FoodStall> allStalls = new ArrayList<>();
	        allStalls.addAll(zoneA);
	        allStalls.addAll(zoneB);

	        List<FoodStall> sortedStalls = mergeSort(allStalls);

	        System.out.println("Master Footfall Report:");
	        for (FoodStall stall : sortedStalls) {
	            System.out.println(stall);
	        }
	    }
	  public static List<FoodStall> mergeSort(List<FoodStall> stalls) {
	        if (stalls.size() <= 1) return stalls;

	        int mid = stalls.size() / 2;

	        List<FoodStall> left = mergeSort(stalls.subList(0, mid));
	        List<FoodStall> right = mergeSort(stalls.subList(mid, stalls.size()));

	        return merge(left, right);
	    }

	    private static List<FoodStall> merge(List<FoodStall> left, List<FoodStall> right) {
	        List<FoodStall> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).footfall <= right.get(j).footfall) {
	                result.add(left.get(i++));
	            } else {
	                result.add(right.get(j++));
	            }
	        }

	        while (i < left.size()) result.add(left.get(i++));
	        while (j < right.size()) result.add(right.get(j++));

	        return result;
	    }

	 
}
