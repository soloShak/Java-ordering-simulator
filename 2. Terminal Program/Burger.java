package src;

public class Burger extends Food {

	public Burger(String type, double cost) {
		super(type, 0);
	}

	private Cheese cheeseObject = new Cheese("", 0);
	private Ingredients ingredients[] = new Ingredients[5]; // I have made its size of 5, because we only have 4
															// ingredients to add to burger, but number 4
															// is not that good thus I have chosen 5

	public Cheese getCheeseObject() {
		return cheeseObject;
	}

	public void setCheeseObject(Cheese cheeseObject) {
		this.cheeseObject = cheeseObject;
	}

	public Ingredients[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients[] ingredients) {
		this.ingredients = ingredients;
	}

	// I have made this new function to just initialize all the elements of array
	// Ingredients[5]
	public void initIngredients() {
		for (int i = 0; i < 5; i++)
			ingredients[i] = new Ingredients("", 0);
	}

	// This function checks for the type of Burger user have chosen and assigns its
	// price to cost
	// Also it adds all the ingredients and cheese to burger thus their cost is
	// added to original burger price
	@Override
	public void calculateCost() {
		if (getType().equals("Egg"))
			setCost(4000.0);
		else if (getType().equals("Tikka"))
			setCost(5000.0);
		else if (getType().equals("Ham"))
			setCost(5000.0);
		else if (getType().equals("Roast"))
			setCost(5500.0);

		for (int i = 0; i < 5; i++)
			setCost(getCost() + ingredients[i].getCost());

		setCost(getCost() + cheeseObject.getCost());
	}

}
