package accounts;

import calculators.InterestCalculator;

public abstract class Account {
	private InterestCalculator _interestCalculator;
	
	public abstract void deposit(int amt);

	public Account(InterestCalculator interestCalculator) {
		super();
		this._interestCalculator = interestCalculator;
	}
	
	public void calculateInterest() {
		this._interestCalculator.calculateInterest();
	}
}
