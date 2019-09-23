package srp.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice) {

		System.out.println("ID is:" + invoice.getId() + "\nDescription: " + invoice.getDescription() + "\nCost is: "
				+ invoice.getCost() + "\nDiscount Amount is: " + invoice.calculateDiscount() + "\nTax is:"
				+ invoice.calculateTax() + "\nTotal amount is: " + invoice.calculateTotal());

//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("<html>");
//		stringBuilder.append("<head>");
//		stringBuilder.append("<title>INVOICE");
//		stringBuilder.append("</title>");
//		stringBuilder.append("</head>");
//		stringBuilder.append("<body>\nID is:" + invoice.getId() + "<br>\nDescription: " + invoice.getDescription()
//				+ "<br>\nCost is: " + invoice.getCost() + "<br>\nDiscount Amount is: " + invoice.calculateDiscount()
//				+ "<br>\nTax is:" + invoice.calculateTax() + "<br>\nTotal amount is: " + invoice.calculateTotal());
//		stringBuilder.append("</body>");
//		stringBuilder.append("</html>");
//		try {
//			FileWriter fileWriter=new FileWriter("Resources/invoice.html");
//			BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
//			bufferWriter.write(stringBuilder.toString());
//			bufferWriter.close();
//		} catch (IOException e) {
//			
//			System.out.println("File is not present on location...Please create file on given location.");
//		}
		
		
	}
	
	public void printInvoiceOnBrowser(Invoice invoice) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<html>");
		stringBuilder.append("<head>");
		stringBuilder.append("<title>INVOICE");
		stringBuilder.append("</title>");
		stringBuilder.append("</head>");
		stringBuilder.append("<body>\nID is:" + invoice.getId() + "<br>\nDescription: " + invoice.getDescription()
				+ "<br>\nCost is: " + invoice.getCost() + "<br>\nDiscount Amount is: " + invoice.calculateDiscount()
				+ "<br>\nTax is:" + invoice.calculateTax() + "<br>\nTotal amount is: " + invoice.calculateTotal());
		stringBuilder.append("</body>");
		stringBuilder.append("</html>");
		try {
			FileWriter fileWriter=new FileWriter("Resources/invoice.html");
			BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
			bufferWriter.write(stringBuilder.toString());
			bufferWriter.close();
		} catch (IOException e) {
			
			System.out.println("File is not present on location...Please create file on given location.");
		}
		
	}
}
