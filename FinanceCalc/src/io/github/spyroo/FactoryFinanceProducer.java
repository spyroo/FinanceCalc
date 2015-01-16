package io.github.spyroo;

public class FactoryFinanceProducer {
	
	public static enum FactoryType{
		INCOME, EXPENSE
		};
	
	public static AbstractFinanceFactory getFactory(FactoryType type){
		switch(type){
			case INCOME:
				return new IncomeFactory();
			case EXPENSE:
				return new ExpenseFactory();
			default:
				return null;
		}
	}
	
}
