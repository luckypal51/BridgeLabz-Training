package streamApi.insurence;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Claims> claim = new ArrayList<>();
		claim.add(new Claims("health",450000));
		claim.add(new Claims("life",750000));
		claim.add(new Claims("health",47000));
		claim.add(new Claims("vehicle",789000));
		claim.add(new Claims("life",4500000));
		
		Map<String, Double> map = claim.stream().collect(Collectors.groupingBy(x->x.claimsType,Collectors.averagingDouble(x->x.amount)));
		map.forEach((String s,Double b)->System.out.println(s+" -> Average Amount is -> "+b));
	}
}
