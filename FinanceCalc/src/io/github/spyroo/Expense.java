package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

import java.util.List;

public class Expense extends MonetaryChange{

	private double amount;
	private List<Timeframe> timeframe;
	private List<Timeframe> frequency;
	
	protected Expense(double amount, List<Timeframe> timeframe, List<Timeframe> frequency){
		setAmount(amount);
		setTimeframe(timeframe);
		setFrequency(frequency);
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTimeframe(List<Timeframe> timeframe) {
		this.timeframe = timeframe;
	}
	
	public void setFrequency(List<Timeframe> frequency) {
		this.frequency = frequency;
	}

	@Override
	public double getAmount() {
		return -amount;
	}

	@Override
	public List<Timeframe> getTimeframe() {
		return timeframe;
	}

	@Override
	public List<Timeframe> getFrequency() {
		return frequency;
	}

	@Override
	double getTimeframeValue() {
		return 1 / timeframe.stream().mapToDouble(obj -> (1 / obj.getValue())).sum();
	}

	@Override
	double getFrequencyValue() {
		return 1 / frequency.stream().mapToDouble(obj -> (1 / obj.getValue())).sum();
	}
	
	
}
