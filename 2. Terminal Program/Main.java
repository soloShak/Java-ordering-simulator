package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int choice; // used for all user inputs
		Scanner input = new Scanner(System.in);

		System.out.println("===================================");
		System.out.println("Welcome TO SKKU-SUBWAY");
		System.out.println("Choose burgers (sandwiches):");
		System.out.println("1. Egg Mayo - 4,000 won");
		System.out.println("2. Chicken Tikka - 5,000 won");
		System.out.println("3. Chicken Ham - 5,000 won");
		System.out.println("4. Roasted Chicken - 5,500 won");
		System.out.println("0. Cancel Order");
		System.out.print("Select Burger (1-5): ");
		choice = input.nextInt();

		// Simply, these lines just asks user for his choice of Burger and assigns
		// user-chosen type of Burger
		Burger burgerObj = new Burger("", 0);
		if (choice == 0) {
			System.out.println("Order is cancelled. Have a nice day!");
			System.exit(0);
		} else if (choice == 1)
			burgerObj.setType("Egg");
		else if (choice == 2)
			burgerObj.setType("Tikka");
		else if (choice == 3)
			burgerObj.setType("Ham");
		else if (choice == 4)
			burgerObj.setType("Roast");

		System.out.println("===================================");
		System.out.println("Select Cheese Type: ");
		System.out.println("1. American Cheese - (+0 won)");
		System.out.println("2. Swiss - (+100 won)");
		System.out.println("3. Cheddar - (+0 won)");
		System.out.print("Select Cheese (1-3): ");
		choice = input.nextInt();

		// Same thing just above but with Cheese this time
		Cheese cheeseObj = new Cheese("", 0);
		if (choice == 1)
			cheeseObj.setType("American");
		if (choice == 2)
			cheeseObj.setType("Swiss");
		if (choice == 3)
			cheeseObj.setType("Cheddar");
		cheeseObj.calculateCost();

		// These lines are little bit confusing but what it does is asks user for
		// ingredients of burger and writes ingredients type to the certain element of
		// array Ingredients[] which has size of 5. And in order to user can choose
		// other ingredients I have put it inside the for loop which breaks either when
		// user chooses to skip this part or when number of for loop iterations reach
		// the max number of the array
		Ingredients ingredientsObj[] = new Ingredients[5];
		burgerObj.setIngredients(ingredientsObj);
		burgerObj.initIngredients();
		for (int i = 0; i < 5; i++) {
			System.out.println("===================================");
			System.out.println("Select Ingredients:");
			System.out.println("1. Lettuce - (+0 won)");
			System.out.println("2. Tomatoes - (+0 won)");
			System.out.println("3. Cucumbers - (+50 won)");
			System.out.println("4. Olives - (+50 won)");
			System.out.println("0. Skip");
			System.out.print("Select Ingredients (1-4): ");
			choice = input.nextInt();

			if (choice == 0)
				break;
			else if (choice == 1)
				ingredientsObj[i].setType("Lettuce");
			else if (choice == 2)
				ingredientsObj[i].setType("Tomato");
			else if (choice == 3)
				ingredientsObj[i].setType("Cucumber");
			else if (choice == 4)
				ingredientsObj[i].setType("Olive");
			ingredientsObj[i].calculateCost();
		}

		// Following 4 blocks of code are used to ask user about the beverage(with ice or without it)
		// and then ask about extras
		boolean isBeverage = true; // is used to determine if user has chosen beverage or not
		System.out.println("===================================");
		System.out.println("Select Beverages: ");
		System.out.println("1. Cola - 1,000 won");
		System.out.println("2. Fanta - 1,100 won");
		System.out.println("3. Chilsung Cider - 900 won");
		System.out.println("4. Zero Cola - 1,200 won");
		System.out.println("5. Coffee - 2,000 won");
		System.out.println("0. Skip");
		System.out.print("Select Beverage (1-5): ");
		choice = input.nextInt();

		Beverage beverageObj = new Beverage("", 0);
		if (choice == 0)
			isBeverage = false;
		else if (choice == 1)
			beverageObj.setType("Cola");
		else if (choice == 2)
			beverageObj.setType("Fanta");
		else if (choice == 3)
			beverageObj.setType("Cider");
		else if (choice == 4)
			beverageObj.setType("Zero");
		else if (choice == 5)
			beverageObj.setType("Coffee");
		beverageObj.calculateCost();

		if (choice > 0) {
			System.out.println("===================================");
			System.out.print("With ice? (0[no] or 1[yes]): ");
			choice = input.nextInt();
			if (choice == 1)
				beverageObj.setIce(true);
			else
				beverageObj.setIce(false);
		}

		boolean isExtra = true; // used to determine if user has chosen extra or not
		System.out.println("===================================");
		System.out.println("Select extras: ");
		System.out.println("1. Cookies - 1,500 won");
		System.out.println("2. French Fries - 1,300 won");
		System.out.println("3. Chips - 1,700 won");
		System.out.println("0. Skip");
		System.out.print("Select Beverage (1-5): ");
		choice = input.nextInt();

		Extra extraObj = new Extra("", 0);
		if (choice == 0)
			isExtra = false;
		else if (choice == 1)
			extraObj.setType("Cookie");
		else if (choice == 2)
			extraObj.setType("Fries");
		else if (choice == 3)
			extraObj.setType("Chips");
		extraObj.calculateCost();
		
		// using these 3 lines of code we can calculate the cost of Burger with cheese and ingredients
		burgerObj.setCheeseObject(cheeseObj);
		burgerObj.setIngredients(ingredientsObj);
		burgerObj.calculateCost();

		// And FINALLY, these lines are used just for the output of the program
		double total = 0; // to calculate total cost
		System.out.println("===================================");
		System.out.println("| Burger (with cheese and ingredients): " + burgerObj.getCost());
		total += burgerObj.getCost();
		if (isBeverage) {
			if (beverageObj.isIce())
				System.out.println("| Beverage (with ice): " + beverageObj.getCost());
			else
				System.out.println("| Beverage (without ice): " + beverageObj.getCost());
			total += beverageObj.getCost();
		}
		if (isExtra) {
			System.out.println("| Extra: " + extraObj.getCost());
			total += extraObj.getCost();
		}
		System.out.println("| TOTAL: " + total);
	}

}
