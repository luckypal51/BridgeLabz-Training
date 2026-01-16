package Question.EventManager;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Ticket[] arr = {new Ticket(1500.0),new Ticket(120.0),new Ticket(1800.0),new Ticket(100),new Ticket(800)};
	    quick(arr,0,arr.length-1);
	    System.out.println(Arrays.toString(arr));
	}
	public static void quick(Ticket[] arr ,int start,int end) {
		if(start>=end) {
			return;
		}
		double pivot = arr[end].price;
		int i = start-1;
		int j = start;
		while(j<=end) {
			if(arr[j].price<pivot) {
			    i+=1;
				Ticket temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		i+=1;
		Ticket temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		quick(arr,start,i-1);
		quick(arr,i+1,end);
	}
}
