package io.github.spyroo;

import io.github.spyroo.MonetaryChange.Timeframe;

public class ExpenseFactory extends AbstractFinanceFactory{

	@Override
	public Expense getExpense(double amount, Timeframe timeframe, Timeframe frequency) {
		return new Expense(amount, timeframe, frequency);
	}

	@Override
	public Income getIncome(double amount, Timeframe timeframe, Timeframe frequency) {
		return null;
	}
	
	
	
}
