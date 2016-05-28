package factories;

import accounts.Account;
import accounts.Savings;
import calculators.InterestAlgorithm1;
import calculators.InterestCalculator;

public class BankSystemFactory1 extends BankSystemFactory {

	@Override
	public Account createAccount(InterestCalculator interestCalculator) {
		return new Savings(interestCalculator);
	}

	@Override
	public InterestCalculator createInterestcalculator() {
		return new InterestAlgorithm1();
	}

}
