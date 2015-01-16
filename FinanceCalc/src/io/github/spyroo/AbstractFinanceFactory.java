package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

public abstract class AbstractFinanceFactory {
	
	public abstract Expense getExpense(double amount, Timeframe timeframe, Timeframe frequency);
	public abstract Income getIncome(double amount, Timeframe timeframe, Timeframe frequency);
	
}
