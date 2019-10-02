package dip.violetion;

public class TaxCalculator {

	private LogType logType;

	public TaxCalculator(LogType type) {
		this.logType = type;
	}

	public int calculateTax(int amount, int rate) {
		try {
			int r = amount / rate;
			return r;
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println("Something is wrong...Please enter valid number.");
			if (logType.equals(LogType.XML)) {
				new XMLLogger().log(message);
				
			} else {
				new FileLogger().log(message);
				
			}
//			throw e;
		}
		
		return -1;
	}
}
