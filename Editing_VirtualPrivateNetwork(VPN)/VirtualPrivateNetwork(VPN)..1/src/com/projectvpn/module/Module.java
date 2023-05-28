package com.projectvpn.module;

public class Module {
	
	protected String moduleName;

	public Module(String moduleName) {
		this.moduleName = moduleName;
	}

	public void displayMenu() {
		System.out.println("Welcome to " + moduleName + " module!");
		System.out.println("1. View operations");
		System.out.println("2. Manage staff details");
		System.out.println("3. Perform technical operations");
		System.out.println("4. Exit from "+moduleName);
	}

	public void performOperation(int choice) {
		switch (choice) {
		case 1:
			viewOperations();
			break;
		case 2:
			manageStaffDetails();
			break;
		case 3:
			performTechnicalOperations();
			break;
		case 4:
			System.out.println("Exiting " + moduleName + " module.\n");
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}

	public void viewOperations() {
		System.out.println("You have selected viewing operations of " + moduleName + " module.\n");
	}

	public void manageStaffDetails() {
		System.out.println("You have selected managing staff details of " + moduleName + " module.\n");
	}

	public void performTechnicalOperations() {
		System.out.println("You have selected performing technical operations of " + moduleName + " module.\n");
	}
}
