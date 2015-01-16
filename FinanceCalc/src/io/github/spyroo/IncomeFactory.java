package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

public class IncomeFactory extends AbstractFinanceFactory{

	@Override
	public Expense getExpense(double amount, Timeframe timeframe, Timeframe frequency) {
		return null;
	}

	@Override
	public Income getIncome(double amount, Timeframe timeframe, Timeframe frequency) {
		return new Income(amount, timeframe, frequency);
	}
	
}
