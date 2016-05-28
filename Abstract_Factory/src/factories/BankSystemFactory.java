package factories;

import accounts.Account;
import calculators.InterestCalculator;

public abstract class BankSystemFactory {
	public abstract Account createAccount(InterestCalculator interestCalculator);

	public abstract InterestCalculator createInterestcalculator();
}
