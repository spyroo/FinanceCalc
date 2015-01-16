package io.github.spyroo;

public class Income extends MonetaryChange{
	
	private double amount;
	private Timeframe timeframe;
	private Timeframe frequency;
	
	protected Income(double amount, Timeframe timeframe, Timeframe frequency){
		setAmount(amount);
		setTimeframe(timeframe);
		setFrequency(frequency);
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTimeframe(Timeframe timeframe) {
		this.timeframe = timeframe;
	}
	
	public void setFrequency(Timeframe frequency) {
		this.frequency = frequency;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public Timeframe getTimeframe() {
		return timeframe;
	}

	@Override
	public Timeframe getFrequency() {
		return frequency;
	}
	
}
