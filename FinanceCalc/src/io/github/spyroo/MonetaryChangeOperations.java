package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonetaryChangeOperations {
	
	public static double getYearTotal(List<MonetaryChange> changes){
		return changes.stream().mapToDouble(obj -> obj.getAmount() * (obj.getFrequency().getValue())).sum();
	}
	
	public static List<MonetaryChange> expireCharges(List<MonetaryChange> changes, Timeframe timePassed){
		List<Object> items = Arrays.asList(changes.stream().filter(obj -> obj.getTimeframe().getValue() < timePassed.getValue()).toArray());
		List<MonetaryChange> newchanges = new ArrayList<MonetaryChange>();
		for(Object o : items){
			newchanges.add((MonetaryChange) o);
		}
		return newchanges;
	}
	
	public static double getTotalAfterTime(List<MonetaryChange> changes, Timeframe timePassed){
		return changes.stream().mapToDouble(obj -> (obj.getAmount() * obj.getFrequency().getValue()) / timePassed.getValue()).sum();
	}
	

	
}
