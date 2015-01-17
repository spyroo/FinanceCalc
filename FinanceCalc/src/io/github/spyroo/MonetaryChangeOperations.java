package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class MonetaryChangeOperations {
	
	/*public static double getYearTotal(List<MonetaryChange> changes) {
		return changes.stream().mapToDouble(obj -> obj.getAmount() * (obj.getFrequency().getValue())).sum();
	}*/
	
	/*public static List<MonetaryChange> expireCharges(List<MonetaryChange> changes, Timeframe timePassed) {
		List<Object> items = Arrays.asList(changes.stream().filter(obj -> obj.getTimeframe().getValue() < timePassed.getValue()).toArray());
		List<MonetaryChange> newchanges = Arrays.asList(items.toArray(new MonetaryChange[items.size()]));
		return newchanges;
	}*/
	
	/**
	 * The most beautiful line of code I have ever written.
	 * @param changes
	 * @param timePassed
	 * @return
	 */
	public static double getTotalAfterTime(List<MonetaryChange> changes, List<Timeframe> timePassed) {
		double mult = 1 / timePassed.stream().mapToDouble(obj -> (1 / obj.getValue())).sum();
		return changes.stream().mapToDouble(obj -> mult < obj.getTimeframeValue() ? (obj.getFrequencyValue() / obj.getTimeframeValue() * obj.getAmount()) : ( (obj.getAmount() * obj.getFrequencyValue()) / mult) ).sum();
	}
	
	public static String getFormattedString(double amount){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(amount);
	}
	
	
}
