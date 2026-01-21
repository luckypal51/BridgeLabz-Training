package Question.TailorShop;

public class Main {
	  public static void main(String[] args) {

	        Order[] orders = {
	            new Order(101, 2),
	            new Order(102, 4),
	            new Order(103, 6),
	           
	            new Order(104, 3)
	        };

	        insertionSort(orders);

	        System.out.println("Orders Sorted by Delivery Deadline:");
	        for (Order o : orders) {
	            System.out.println(o);
	        }
	    }
	public static void insertionSort(Order[] orders) {

        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

           
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }
}
