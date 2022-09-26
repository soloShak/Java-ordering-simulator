package src;

public class Cheese extends Food{
	
	public Cheese(String type, double cost) {
		super(type, 0);
		// TODO Auto-generated constructor stub
	}
	
	
	// This function checks for the type of Object and assigns its price to cost
	@Override
	public void calculateCost() {
		if (getType().equals("American"))
			setCost(getCost());
		else if (getType().equals("Swiss"))
			setCost(getCost() + 100.0);
		if (getType().equals("Cheddar"))
			setCost(getCost());
	}

}
