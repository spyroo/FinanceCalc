package io.github.spyroo;

import java.util.List;

import io.github.spyroo.MonetaryChange.Timeframe;

public class IncomeFactory extends AbstractFinanceFactory{

	@Override
	public Expense getExpense(double amount, List<Timeframe> timeframe, List<Timeframe> frequency) {
		return null;
	}

	@Override
	public Income getIncome(double amount, List<Timeframe> timeframe, List<Timeframe> frequency) {
		return new Income(amount, timeframe, frequency);
	}
	
}
