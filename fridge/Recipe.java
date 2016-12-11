package iristk.app.fridge;

import java.util.ArrayList;

public class Recipe {
	private ArrayList<Ingredient> ingredients;
	
	private String name;
	
	public Recipe(String name, ArrayList<Ingredient> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
}