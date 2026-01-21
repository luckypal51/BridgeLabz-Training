package Question.MedWarehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static List<Medicine> mergeSort(List<Medicine> medicines) {
	        if (medicines.size() <= 1)
	            return medicines;

	        int mid = medicines.size() / 2;

	        List<Medicine> left = mergeSort(medicines.subList(0, mid));
	        List<Medicine> right = mergeSort(medicines.subList(mid, medicines.size()));

	        return merge(left, right);
	    }

	   
	    private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {
	        List<Medicine> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < left.size() && j < right.size()) {
	            if (!left.get(i).expiryDate.isAfter(right.get(j).expiryDate)) {
	                result.add(left.get(i++));
	            } else {
	                result.add(right.get(j++));
	            }
	        }

	        while (i < left.size()) result.add(left.get(i++));
	        while (j < right.size()) result.add(right.get(j++));

	        return result;
	    }

	    public static void main(String[] args) {

	        
	        List<Medicine> branchA = List.of(
	                new Medicine("Paracetamol", LocalDate.of(2026, 1, 10), "Branch A"),
	                new Medicine("Aspirin", LocalDate.of(2026, 3, 5), "Branch A")
	        );

	        List<Medicine> branchB = List.of(
	                new Medicine("Insulin", LocalDate.of(2026, 2, 15), "Branch B"),
	                new Medicine("Amoxicillin", LocalDate.of(2026, 4, 20), "Branch B")
	        );

	      
	        List<Medicine> allMedicines = new ArrayList<>();
	        allMedicines.addAll(branchA);
	        allMedicines.addAll(branchB);

	        List<Medicine> sortedList = mergeSort(allMedicines);

	        System.out.println("🏥 Master Expiry List:");
	        for (Medicine m : sortedList) {
	            System.out.println(m);
	        }
	    }
}
