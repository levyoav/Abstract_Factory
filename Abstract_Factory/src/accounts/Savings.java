package accounts;

import calculators.InterestCalculator;

public class Savings extends Account {


	public Savings(InterestCalculator interestCalculator) {
		super(interestCalculator);
	}

	@Override
	public void deposit(int amt) {
		System.out.println("Savings deposit: " + amt);
	}

}
