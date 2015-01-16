package io.github.spyroo;

public abstract class MonetaryChange {
	enum Timeframe {
		
		YEAR(1), 
		MONTH(YEAR.getValue() * 12), 
		WEEK(52), 
		DAY(WEEK.getValue() * 7), 
		HOUR(DAY.getValue() * 24), 
		MINUTE(HOUR.getValue() * 60), 
		SECOND(MINUTE.getValue() * 60);
		
		private double value;
		private Timeframe(double value){
			this.value = value;
		}
		/**
		 * 
		 * @return Returns the value of the enum
		 */
		public double getValue(){
			return value;
		}
	};
	abstract double getAmount();
	abstract Timeframe getTimeframe();
	abstract Timeframe getFrequency();
}
