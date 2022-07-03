package rfeedbackservicepublisher;

import java.util.Scanner;

public class RFeedbackServicePublishImpl implements RFeedbackServicePublish {
	

	Scanner scanner = new Scanner(System.in);
	
	
	public String getCustomerFeedback() {
		
		
		System.out.println("Enter required details for delivery process.");
	
		
		System.out.println("Enter your Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your product name: ");
		String pName = scanner.nextLine();
		
		System.out.println("Enter your product ID: ");
		String pID = scanner.nextLine();
		
		System.out.println("Enter message: ");
		String message = scanner.nextLine();
		
		
		System.out.println("");
		System.out.println("............Your feedback details............");
		System.out.println("");
		
		System.out.println("Name: " + name);
		System.out.println("Product Name: " + pName);
		System.out.println("Product ID: " + pID);
		System.out.println("Comment: " + message);
		
		System.out.println("");
		System.out.println("....................................");
		
		return "Done";
	}

}
