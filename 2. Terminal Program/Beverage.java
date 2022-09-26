package src;

public class Beverage extends Food {

	public Beverage(String type, double cost) {
		super(type, cost);
		// TODO Auto-generated constructor stub
	}

	private boolean ice;

	public boolean isIce() {
		return ice;
	}

	public void setIce(boolean ice) {
		this.ice = ice;
	}

	// This function checks for the type of Object and assigns its price to cost
	@Override
	public void calculateCost() {
		if (getType().equals("Cola"))
			setCost(1000.0);
		else if (getType().equals("Fanta"))
			setCost(1100.0);
		else if (getType().equals("Cider"))
			setCost(900.0);
		else if (getType().equals("Zero"))
			setCost(1200.0);
		else if (getType().equals("Coffee"))
			setCost(2000.0);
	}
}
