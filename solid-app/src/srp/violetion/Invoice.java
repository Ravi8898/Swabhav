package srp.violetion;

public class Invoice {

	private int id;
	private String description;
	private double cost;
	private float discountPercentage;
	private final float GST = 18;

	public Invoice(int id, String description, double cost, float discountPercentage) {

		this.id = id;
		this.description = description;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public double calculateDiscount() {
		return ((cost * discountPercentage) / 100);

	}

	public double calculateTax() {
		return ((cost * GST) / 100);
	}

	public double calculateTotal() {
		return ((cost + calculateTax() - calculateDiscount()));
	}

	public void print(Invoice invoice) {

		System.out.println("ID is:"+invoice.id+"\nDescription: " + invoice.description + "\nCost is: " + invoice.cost + "\nDiscount Amount is: "
				+ invoice.calculateDiscount() + "\nTax is:" + invoice.calculateTax() + "\nTotal amount is: " + invoice.calculateTotal());
	}
}
