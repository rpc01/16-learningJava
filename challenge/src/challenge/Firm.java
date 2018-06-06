package challenge;

import java.awt.*;

public class Firm {
	String name;
	double price;
	int stockNumber;
	
	public Firm(String inputName,
			double inputPrice,
			int inputStockNumber) {
		this.name=inputName;
		this.price=inputPrice;
		this.stockNumber=inputStockNumber;}
	
	public void changeprice(double newPrice) {
		this.price =newPrice;
	}
	
}


