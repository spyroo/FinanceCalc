package io.github.spyroo;

import java.util.List;

import io.github.spyroo.MonetaryChange.Timeframe;

public abstract class AbstractFinanceFactory {
	
	public abstract Expense getExpense(double amount, List<Timeframe> timeframe, List<Timeframe> frequency);
	public abstract Income getIncome(double amount, List<Timeframe> timeframe, List<Timeframe> frequency);
	
}
