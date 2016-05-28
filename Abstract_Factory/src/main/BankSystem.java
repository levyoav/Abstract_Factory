package main;
import accounts.Account;
import calculators.InterestAlgorithm1;
import calculators.InterestCalculator;
import factories.BankSystemFactory;


public class BankSystem {
	public static void main(String[] args) {
		String className = null;

		if(args.length == 0) {
			className = "factories.BankSystemFactory2";
		} else {
			className = args[0];
		}

		try {

			Class cls = Class.forName(className);
			BankSystemFactory factory = (BankSystemFactory) cls.newInstance();
			BankSystem bank = new BankSystem(factory); 
			
		} catch (InstantiationException|IllegalAccessException|ClassNotFoundException e) {
			System.out.println("The calss name " + className + " provided at command line doesn't exist.");
			e.printStackTrace();
		}
	}
	
	public BankSystem(BankSystemFactory bankFactory) {
		//Creates an 'InterestAlgorithm2' instance from the factory without importing the class itself. Only the interface 'InterestCalculator'. 
		InterestCalculator i = bankFactory.createInterestcalculator();

		//For instantiating an 'InterestAlgorithm1' object, need to import its class. Importing the interface 'InterestCalculator' is not enough.
		//By preventing access to the class, the factory actually controls what instance of 'InterestCalculator' will be returned.
//		InterestCalculator i = new InterestAlgorithm1();
		
		Account a = bankFactory.createAccount(i);
		a.deposit(100);
		a.calculateInterest();
	}
}
