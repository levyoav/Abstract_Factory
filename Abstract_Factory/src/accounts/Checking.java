package accounts;

import calculators.InterestCalculator;

public class Checking extends Account {


	public Checking(InterestCalculator interestCalculator) {
		super(interestCalculator);
	}

	@Override
	public void deposit(int amt) {
		System.out.println("Checking deposit: " + amt);

	}

}
