package io.github.spyroo;

import static io.github.spyroo.FactoryFinanceProducer.FactoryType;
import static io.github.spyroo.MonetaryChange.Timeframe;

import java.util.ArrayList;
import java.util.List;

public class FinanceDebugMain {
	
	public static void main(String[] args){
		new FinanceDebugMain();
	}
	
	public FinanceDebugMain(){
		AbstractFinanceFactory incomeFactory = FactoryFinanceProducer.getFactory(FactoryType.INCOME);
		Income tempIncome =  incomeFactory.getIncome(0, Timeframe.YEAR, Timeframe.DAY);
		AbstractFinanceFactory expenseFactory = FactoryFinanceProducer.getFactory(FactoryType.EXPENSE);
		Expense tempExpense = expenseFactory.getExpense(20, Timeframe.YEAR, Timeframe.DAY);
		
		List<MonetaryChange> changes = new ArrayList<>();
		changes.add(tempIncome);
		changes.add(tempExpense);
		
		System.out.println(MonetaryChangeOperations.getYearTotal(changes));
		System.out.println(MonetaryChangeOperations.getTotalAfterTime(changes, Timeframe.WEEK));
		
		
	}
	
	
}
