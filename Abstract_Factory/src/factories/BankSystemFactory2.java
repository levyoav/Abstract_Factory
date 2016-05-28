package factories;

import accounts.Account;
import accounts.Checking;
import calculators.InterestAlgorithm2;
import calculators.InterestCalculator;

public class BankSystemFactory2 extends BankSystemFactory {

	@Override
	public Account createAccount(InterestCalculator interestCalculator) {
		return new Checking(interestCalculator);
	}

	@Override
	public InterestCalculator createInterestcalculator() {
		return new InterestAlgorithm2();
	}

}
