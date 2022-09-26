package src;

public class Extra extends Food {

	public Extra(String type, double cost) {
		super(type, cost);
		// TODO Auto-generated constructor stub
	}

	// This function checks for the type of Object and assigns its price to cost
	@Override
	public void calculateCost() {
		if (getType().equals("Cookie"))
			setCost(1500.0);
		else if (getType().equals("Fries"))
			setCost(1300.0);
		else if (getType().equals("Chips"))
			setCost(1700.0);
	}

}
