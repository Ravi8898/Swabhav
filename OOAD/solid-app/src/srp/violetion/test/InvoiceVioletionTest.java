package srp.violetion.test;

import srp.violetion.Invoice;

public class InvoiceVioletionTest {

	public static void main(String[] args) {

		Invoice invoice=new Invoice(101, "Book", 500, 20);
		invoice.print(invoice);
	}

}
