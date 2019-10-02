package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class InvoiceSolutionTest {

	public static void main(String[] args) {

		Invoice invoice1=new Invoice(200, "Invoice of Pen", 50, 10);
		InvoicePrinter invoicePrinter=new InvoicePrinter();
		invoicePrinter.printInvoice(invoice1);
	}
}
