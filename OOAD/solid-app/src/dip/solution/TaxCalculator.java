package dip.solution;

public class TaxCalculator {

	private ILogger logger;

	public TaxCalculator(ILogger logger) {

		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		try {
			int r = amount / rate;
			return r;
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println("Something is wrong...Please enter valid number.");
			logger.log(message);
			throw e;
		}

//		return -1;
	}
}
