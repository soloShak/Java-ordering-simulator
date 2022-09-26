package src;

public class Food implements Payment {

	private String type;
	private double cost;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Food(String type, double cost) {
		super();
		this.type = type;
		this.cost = cost;
	}

	// I made this function empty so other functions can implement it for their purpose
	@Override
	public void calculateCost() {
	}

}
