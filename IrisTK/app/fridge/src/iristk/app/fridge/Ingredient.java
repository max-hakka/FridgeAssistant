package iristk.app.fridge;

public class Ingredient {
	private double quantity;
	private Unit unit;
	private String name;

	public Ingredient(String name, double quantity, Unit unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void merge(Ingredient other) {
		assert(getName().equals(other.getName()));

		quantity += other.quantity;
	}

	public boolean hasEnough(Object o) {
		if (o instanceof Ingredient) {
			Ingredient i = (Ingredient) o;

			return name.equals(i.name) && quantity >= i.quantity && unit == i.unit;
		}

		return false;
	}
	
	public double updateQuantity(double q) {
		quantity -= q;

		return quantity;
	}
}