package ocp.violation;

public class FixedDeposit {

	private String name;
	private double principal;
	private int years;
	private FestivalType festival;
	
	public FixedDeposit(String name, double principal, int years, FestivalType festival) {
		
		this.name=name;
		this.principal=principal;
		this.years=years;
		this.festival=festival;
	}
	
	public double calculateSimpleIntrest() {
		
		int rateOfIntrest=getROI();
		return ((principal*years*rateOfIntrest)/100);
	}
	
	public int getROI() {
		
		int rateOfIntrest;
		if(festival.equals(FestivalType.HOLI)) {
			return rateOfIntrest=8;
		}
		else if(festival.equals(FestivalType.NEWYEAR))
			return rateOfIntrest=9;
		
			return rateOfIntrest=7;
	}
}
