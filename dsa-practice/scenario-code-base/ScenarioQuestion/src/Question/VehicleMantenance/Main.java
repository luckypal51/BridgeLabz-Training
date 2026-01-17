package Question.VehicleMantenance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	Vehicle[] arr = {new Vehicle("MP 04 BH 3632",80),new Vehicle("MH 12 BH 1470",75),new Vehicle("UP 07 BH 5012",10)};
    	System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    	
    }
    public static Vehicle[] mergeSort(Vehicle[] arr,int start,int end) {
    	if(start>=end) {
    		return new Vehicle[] {arr[end]};
    	}
    	int mid = start+(end-start)/2;
    	Vehicle[]arr1 = mergeSort(arr,start,mid);
    	Vehicle[]arr2 = mergeSort(arr,mid+1,end);
    	return merge(arr1,arr2);
    }
    public static Vehicle[] merge(Vehicle[] arr1, Vehicle[] arr2) {
    	Vehicle[] arr = new Vehicle[arr1.length+arr2.length];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while(i<arr1.length&&j<arr2.length) {
    		if(arr1[i].mileage<arr2[j].mileage) {
    			arr[k++] = arr1[i++];
    		}else {
    			arr[k++] = arr2[j++];
    		}
    	}
    	while(i<arr1.length) {
    		arr[k++] = arr1[i++];
    	}
    	while(j<arr2.length) {
    		arr[k++] = arr2[j++];
    	}
    	return arr;
    }
}
