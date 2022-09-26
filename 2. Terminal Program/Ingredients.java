package src;

public class Ingredients extends Food{

	public Ingredients(String type, double cost) {
		super(type, cost);
	}
	
	// This function checks for the type of Object and assigns its price to cost
	@Override
	public void calculateCost() {
		if (getType().equals("Lettuce"))
			setCost(getCost());
		else if (getType().equals("Tomato"))
			setCost(getCost());
		else if (getType().equals("Cucumber"))
			setCost(getCost() + 50.0);
		else if (getType().equals("Olive"))
			setCost(getCost() + 50.0);
	}
	

}
