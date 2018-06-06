package challenge;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		Firm Firm1 = new Firm("Firm1",12,500);
		Firm Firm2 = new Firm("Firm2",6,250);
		Firm Firm3 = new Firm("Firm3",3,50);
		
		System.out.println("Price of Firm1 is: "+Firm1.price);
		Firm1.changeprice(120);
		System.out.println("New Price of Firm1 is: "+Firm1.price);
				
	}
}
