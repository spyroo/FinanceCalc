package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;
import java.util.Arrays;
import java.util.List;

public class MonetaryChangeOperations {
	
	public static double getYearTotal(List<MonetaryChange> changes) {
		return changes.stream().mapToDouble(obj -> obj.getAmount() * (obj.getFrequency().getValue())).sum();
	}
	
	public static List<MonetaryChange> expireCharges(List<MonetaryChange> changes, Timeframe timePassed) {
		List<Object> items = Arrays.asList(changes.stream().filter(obj -> obj.getTimeframe().getValue() < timePassed.getValue()).toArray());
		List<MonetaryChange> newchanges = Arrays.asList(items.toArray(new MonetaryChange[items.size()]));
		return newchanges;
	}
	/**
	 * The most beautiful line of code I have ever written.
	 * @param changes
	 * @param timePassed
	 * @return
	 */
	public static double getTotalAfterTime(List<MonetaryChange> changes, Timeframe timePassed) {
		return changes.stream().mapToDouble(obj -> timePassed.getValue() < obj.getTimeframe().getValue() ? (obj.getFrequency().getValue() / obj.getTimeframe().getValue() * obj.getAmount()) : ( (obj.getAmount() * obj.getFrequency().getValue()) / timePassed.getValue()) ).sum();
	}
	
	
	
}
