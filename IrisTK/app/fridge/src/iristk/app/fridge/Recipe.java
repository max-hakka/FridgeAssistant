package iristk.app.fridge;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	private String name;
	
	public Recipe(String name, List<Ingredient> ingredients) {
		System.out.println("i1=" + ingredients);
		System.out.println("Recipe constructor: " + name);
		System.out.println("Recipe constructor: " + ingredients.size());
		this.name = name;
		this.ingredients = new ArrayList<Ingredient>(ingredients);
	}

	public String getName() {
		return name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
}