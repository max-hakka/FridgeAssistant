package iristk.app.fridge;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	private String name;
	
	public Recipe(String name, List<Ingredient> ingredients) {
		this.name = name;
		this.ingredients = new ArrayList<Ingredient>(ingredients);
	}

	public String getName() {
		return name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
	public static String concat(List<Recipe> recipes) {
		StringBuilder sb = new StringBuilder();

		for (Recipe r : recipes)
			sb.append(r.getName()).append(", ");

		return sb.toString();
	}
}