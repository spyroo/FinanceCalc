package io.github.spyroo;

import static io.github.spyroo.FactoryFinanceProducer.FactoryType;
import static io.github.spyroo.MonetaryChange.Timeframe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinanceDebugMain {
	
	public static void main(String[] args){
		new FinanceDebugMain();
	}
	
	public FinanceDebugMain(){
		AbstractFinanceFactory incomeFactory = FactoryFinanceProducer.getFactory(FactoryType.INCOME);
		Income tempIncome =  incomeFactory.getIncome(1, Arrays.asList(Timeframe.YEAR), Arrays.asList(Timeframe.DAY, Timeframe.DAY));
		AbstractFinanceFactory expenseFactory = FactoryFinanceProducer.getFactory(FactoryType.EXPENSE);
		//Expense tempExpense = expenseFactory.getExpense(0, Timeframe.YEAR, Timeframe.MONTH);
		
		List<MonetaryChange> changes = new ArrayList<>();
		changes.add(tempIncome);
		//changes.add(tempExpense);
		
		//System.out.println(MonetaryChangeOperations.getYearTotal(changes));
		List<Timeframe> totalTime = new ArrayList<>();
		
		totalTime.add(Timeframe.YEAR);

		
		System.out.println(MonetaryChangeOperations.getFormattedString(MonetaryChangeOperations.getTotalAfterTime(changes, totalTime)));
		
		
		
	}
	
	
}
