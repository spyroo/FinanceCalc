package io.github.spyroo;

import java.util.List;

public class Income extends MonetaryChange{
	
	private double amount;
	private List<Timeframe> timeframe;
	private List<Timeframe> frequency;
	
	protected Income(double amount, List<Timeframe> timeframe, List<Timeframe> frequency){
		setAmount(amount);
		setTimeframe(timeframe);
		setFrequency(frequency);
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTimeframe(List<Timeframe> timeframe2) {
		this.timeframe = timeframe2;
	}
	
	public void setFrequency(List<Timeframe> frequency2) {
		this.frequency = frequency2;
	}

	@Override
	public double getAmount() {
		return amount;
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
